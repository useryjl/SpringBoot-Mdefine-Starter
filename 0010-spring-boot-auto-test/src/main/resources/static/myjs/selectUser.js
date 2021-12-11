layui.use(['element','layer','table','form'], function(){ //引入多个模块 数组格式
    var table = layui.table;
    var layer = layui.layer;
    var $ = layui.jquery;
    var  form=layui.form;

    table.render({
        text: {none: '暂无相关数据'}
        ,elem: '#Test'
        ,method:"get"
        ,url:"http://localhost:8080/select"
        ,title: '用户数据表'
        ,even:true
        ,cols: [[ //表头
            {field: 'id', title: 'ID', width:"12%", sort: true, fixed: 'left',align:"center"}
            ,{field: 'userName', title: '用户名', width:"12%",align:"center"}
            ,{field: 'userPwd', title: '密码', width:"12%",align:"center"}
            ,{field: 'gender', title: '性别', width: "12%",align:"center"}
            ,{field: 'email', title: '邮箱', width: "12%",align:"center"}
            ,{field: 'roomId', title: '宿舍号', width: "12%", sort: true,align:"center"}
            ,{field: 'userType', title: '用户类型', width: "12%",align:"center"}
            ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:"16%",align:"center"}
        ]]
        ,page: true
        ,limit:8
        ,loading:true
        ,size:"sm"
        ,response: {
            statusCode: 200
//规定成功的状态码，默认：0  我们后端返回200成功状态码
        }
        ,parseData: function(res) { //将原始数据解析成 table 组件所规定的数据
            console.log(res);
            return {
                "code": res.code, //解析接口状态
                "msg": res.msg, //解析提示文本
                "count": res.count, //解析数据长度
                "data": res.data //解析数据列表
            };
        }
        ,done: function(res, curr, count){
                //如果是异步请求数据方式，res即为你接口返回的信息。
            console.log(res);
        }
    });


    //工具条事件
    table.on('tool(Test)', function(obj){
        var datas = obj.data;    //获得当前行数据
        console.log(datas)

        var layEvent = obj.event;
        var tr = obj.tr;
        if(layEvent === 'del'){ //删除
            layer.confirm('真的删除行么', function(index){
                obj.del();
                layer.close(index);
                //向服务端发送删除指令
                $.ajax({
                    url:"http://localhost:8080/delete",
                    method: "get",
                    data:{id:datas.id},
                    dataType:"json",
                    success: function (result) {
                        console.log(result)
                    }
                })
                layer.alert('删除成功', {icon: 1});
            });
        } else if(layEvent === 'edit') { //编辑
            var id="";
            var code="";
            indec = layer.open({
                type:1,
                title:"修改用户信息",
                content: $('#IDIDID'),
                area: ['1080px', '500px'],
                closeBtn: 1,
                shade: [0.8, '#393D49'],
                resize:true,
                //页面弹出成功后回调  发送查询请求 数据id进行回显
                success: function(layero, index){
                    $.ajax({
                        url:"http://localhost:8080/selectById",
                        method:"get",
                        data:{id:datas.id},
                        dataType: "json",  //字符串 ”json“
                        success:function (resdata) {
                            id = resdata.data.id;
                            code=resdata.data.code;
                            console.log(resdata.data)
                            console.log(resdata.code)
                            $("#idd").val(id)
                            form.render('select')
                        }
                    })
                }
            });
        }
    });

    form.on('submit(submituser)',function (data) {
        console.log(123)
        console.log(data.field) //表单提交的所以数据
        var id = data.field.id;
        var userPwd = data.field.userPwd;
        var userName = data.field.userName;
        var gender = data.field.gender;
        var email = data.field.email;
        var userType = data.field.userType;
        var roomId = data.field.roomId;

        $.ajax({
            url:"http://localhost:8080/update",
            method:"get",
            data:{'id':id,'userPwd':userPwd,
                'userName':userName,
                'gender':gender,'email':email,
                'userType':userType,'roomId':roomId
            },
            dataType:"json",
            success:function (res) {
                layer.close(indec)//关闭层
                console.log(res)
                layer.alert('修改成功', {icon: 1});


                //上述方法等价于
                table.reload('Test', {
                    where: { //设定异步数据接口的额外参数，任意设
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                }); //只重载数据
            }
        })
        //组织表单跳转
        return false;
    })
})
