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
        "userName": "admin",
        "email": "admin@126.com",
        "goodsList": [
            {
                "goodName": "发票",
                "address": "北京"
            },
            {
                "goodName": "手机",
                "address": "上海"
            }
        ]
    };

    $("#btn").click(function () {
        $.ajax({
            url: "home.action",
            data: JSON.stringify(jsonobject),
            // dataType: 'json',
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