<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
        <meta charset="utf-8">
        <title>用户登录表</title>
    <style type="text/css">
        * {
            margin: auto;
        }

        #content {
            margin:  auto;
            width: 100%;
            height: 600px;
            border: 1px transparent solid;
            background-color: #21D4FD;
            background-image: linear-gradient(243deg, #21D4FD 0%, #B721FF 100%);
            background-image: -webkit-linear-gradient(243deg, #21D4FD 0%, #B721FF 100%);
            background-image: -moz-linear-gradient(243deg, #21D4FD 0%, #B721FF 100%);
            background-image: -o-linear-gradient(243deg, #21D4FD 0%, #B721FF 100%);
        }

        #box {
            margin: auto;
            width: 30%;
            height: 360px;
            background-color: #fff;
            text-align: center;
            border-radius: 15px;
            border: 2px #fff solid;
            box-shadow: 10px 10px 5px #000000;
        }

        .title {
            line-height: 58px;
            margin-top: auto;
            font-size: 36px;
            color: #000;
            height: 58px;
        }

        #box:hover {
            border: 2px #fff solid;
        }

        .input {
            margin-top: auto;
        }

        input {
            margin-top: auto;
            outline-style: none;
            border: 1px solid #ccc;
            border-radius: 3px;
            padding: 13px 14px;
            width: 70%;
            font-size: 14px;
            font-weight: 700;
            font-family: "Microsoft soft";
        }

        button {
            margin-top: auto;
            border: none;
            color: #000;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 15px;
            background-color: #CCCCCC;
        }
        button:hover{
            background-color: #B721FF;
            color: #fff;
        }
    </style>
    </head>

<body>
<div id="content">
    <div id="box">
        <div class="title">Login</div>
        <div class="input">
            <form action="/login/user">
                <input type="text" id="username" name="userName" placeholder="用户名" />
                <br>
                <input type="password" id="password" name="userPwd"  placeholder="密码" />
                <br>
                <button type="submit" >登录</button>
                </br>
                </br>
                </br>
                </br>
                ${msg}
            </form>
        </div>
    </div>
</div>

</body>

</html>
