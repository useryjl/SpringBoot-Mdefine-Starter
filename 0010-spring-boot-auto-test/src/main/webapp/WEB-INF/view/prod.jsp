<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>prod</title>
    <link rel="stylesheet" href="../../../css/layui.css">
</head>

<script src="../../../layui.js"></script>
<script type="text/javascript" src="../../../myjs/prod.js"></script>

<body>
<div id="prod">
    <form class="layui-form">
        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">商品名</label>
            <div class="layui-input-block">
                <input type="text" id="prod_name" name="prod_name"  required  lay-verify="required" placeholder="请输入商品名" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item"  style="width: 300px">
            <label class="layui-form-label">商品类型</label>
            <div class="layui-input-block">
                <select name="prod_type" lay-verify="required">
                    <option value="">请选择商品类型</option>
                    <option value="0">手机</option>
                    <option value="1">电视</option>
                    <option value="2">平板</option>
                </select>
            </div>
        </div>




        <div class="layui-form-item"  style="width: 300px">
            <label class="layui-form-label">最低价格</label>
            <div class="layui-input-block">
                <input type="text" name="low_price"  placeholder="请输入最低价格"  autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">最高价格</label>
            <div class="layui-input-block">
                <input type="text" name="heigh_price" placeholder="请输入最高价格" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
<%--
这里是错误原因: 使用type="submit 提交数据"
layui中 提交使用lay-submit  lay-filter提交
--%>
                <button class="layui-btn" lay-submit  lay-filter="submitProds">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>

<table  id="prods" lay-filter="prods"></table>
</body>
</html>
