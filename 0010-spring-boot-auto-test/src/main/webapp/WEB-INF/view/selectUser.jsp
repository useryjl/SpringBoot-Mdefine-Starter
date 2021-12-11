<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<div>
<head>
    <meta charset="utf-8">
    <title>用户信息表</title>
    <link rel="stylesheet" href="../../../css/layui.css">
</head>
<hr>

<script src="../../../layui.js" charset="utf-8"></script>

<%--引入自己的js文件--%>
<script  type="text/JavaScript" src="../../../myjs/selectUser.js" ></script>



<h3 style="align-content: center" align="center"> 欢迎进入宿舍信息管理面板</h3>
</hr>
</div>
</div>
</div>
</div>


<%--<table  id="Test" lay-filter="Test"></table>--%>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>




<%--新增--%>
<div id="IDIDID" style="display: none;">
    <form class="layui-form" >
        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">ID</label>
            <div class="layui-input-block">
                <input type="text" id="idd" name="id" readonly required  lay-verify="required" placeholder="请输入ID" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">姓名</label>
            <div class="layui-input-block">
                <input type="text" name="userName" required lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item"  style="width: 300px">
            <label class="layui-form-label">用户角色</label>
            <div class="layui-input-block">
                <select name="userType" lay-verify="required">
                    <option value="">请选择用户角色</option>
                    <option value="0">舍长</option>
                    <option value="1">班长</option>
                    <option value="2">学习委员</option>
                </select>
            </div>
        </div>




        <div class="layui-form-item"  style="width: 300px">
            <label class="layui-form-label">密码</label>
            <div class="layui-input-block">
                <input type="password" name="userPwd" required lay-verify="required" placeholder="请输入密码"  autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item" style="width: 300px">
            <label class="layui-form-label">宿舍号</label>
            <div class="layui-input-block">
                <input type="text" name="roomId" required  lay-verify="required" placeholder="请输入宿舍号" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="gender" value="1" title="男" checked>
                <input type="radio" name="gender" value="0" title="女" >
            </div>
        </div>
        <div class="layui-form-item layui-form-text" style="width: 300px">
            <label class="layui-form-label">邮箱</label>
            <div class="layui-input-block">
                <input type="email" name="email" required  lay-verify="required" placeholder="请输入邮箱" autocomplete="off" class="layui-input">
            </div>
        </div>



        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="submituser">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>



</body>
</html>
