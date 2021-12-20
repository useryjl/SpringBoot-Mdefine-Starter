layui.use(['element','layer','table','form','laypage','jquery'], function() { //引入多个模块 数组格式
    var table = layui.table;
    var layer = layui.layer;
    var $ = layui.jquery;
    var form = layui.form;

    var account = 0;

    table.render({
        text: {none: '暂无相关数据'}
        , elem: '#prods'
        , method: "get"
        , url: "http://localhost:8080/prodInfoVo"
        , title: '用户数据表'
        , even: true
        , cols: [[ //表头
              {field: 'id', title: 'id', width: "20%", sort: true, fixed: 'left', align: "center"}
            , {field: 'prodName', title: '商品名', width: "20%", align: "center"}
            , {field: 'prodType', title: '商品类型', width: "20%", align: "center"}
            , {field: 'price', title: '价格', width: "20%", align: "center"}
            , {fixed: 'right', title: '操作', toolbar: '#barDemo', width: "20%", align: "center"}
        ]]
        , page: true
        , limit: 6
        , limits: [5, 10, 15, 20, 30]
        , loading: true
        , size: "sm"
        , response: {
            statusCode: 200
            //规定成功的状态码，默认：0  我们后端返回200成功状态码
        }
        , parseData: function (res) { //将原始数据解析成 table 组件所规定的数据
            //res是后端返回的json对象
            var resstr = JSON.stringify(res);
            console.log("res:" + res);
            console.log("resstr:" + resstr);
            let count = resstr.count;
            console.log("id" + count)  //idundefined  错误
            console.log("res.count" + res.count)   //res.count6  直接用json对象取值
            account = res.count;

            return {
                "code": res.code, //解析接口状态
                "msg": res.msg, //解析提示文本
                "count": res.count, //解析数据长度
                "data": res.data //解析数据列表
            };
        }
        , done: function (res, curr, count) {
            //如果是异步请求数据方式，res即为你接口返回的信息。
            console.log(res);
        }
    });

    form.on('submit(submitProds)',function (result) {
        let field = result.field;  //表单提交的数据
        console.log(field);

        let prodName = field.prod_name;
        let prodType = field.prod_type;
        let lowPrice = field.low_price;
        let heighPrice = field.heigh_price;
        $.ajax({
            url:"http://localhost:8080/prodInfoVo",
            method:"get",
            data:{
                'prod_name':prodName,
                'prod_type':prodType,
                'low_price':lowPrice,
                'heigh_price':heighPrice
            },
            dataType:"json",
            success:function (success) {
                console.log(success);

                table.reload('prods', {
                    where: { //设定异步数据接口的额外参数，任意设
                        'prod_name':prodName,
                        'prod_type':prodType,
                        'low_price':lowPrice,
                        'heigh_price':heighPrice
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                }); //只重载数据


            }
        })
        //组织表单跳转
        return  false;
    })
})
