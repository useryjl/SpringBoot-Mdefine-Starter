layui.use(['element','layer','table','form'], function() { //引入多个模块 数组格式
    var table = layui.table;
    var layer = layui.layer;
    var $ = layui.jquery;
    var form = layui.form;





    form.on('submit(submitlogin)',function (data) {
        var field = data.field;  //表单提交的 数据
        console.log(field)

        $.ajax({
            url:"http://localhost:8080/login/user",
            method:"get",
            data:{userName:field.userName,userPwd:field.userPwd},
            dataType:"json",
            success:function (resdata) {
                console.log(resdata);
                layer.alert('登录成功',{icon:1})
            }
        })
        //组织表单跳转
        return false;
    })

})
