<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

</head>
<body>
<h1>Welcome To Struts 2!</h1>

<input type="button" id="btn" value="点击"/>

<script type="text/javascript">

    var jsonobject = {
        "userName": "用户名",
        "email": "邮箱",
        "goodsList": [
            {
                "goodName": "doujiang"
            },
            {
                "goodName": "jiangdou"
            }
        ]
    };

    $("#btn").click(function () {
        $.ajax({
            url: "index.action",
            data: JSON.stringify(jsonobject),
            dataType: 'json',
            contentType: 'application/json',
            type: 'POST',
            async: true,
            success: function (res) {
                console.log(res);
            }
        });
    });
</script>
</body>
</html>