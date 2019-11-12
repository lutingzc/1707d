<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="resource/bootstrap/js/bootstrap.js"></script>
</head>
<body>
${info }
<div class="container" style="background:gray">
container
</div>
<div class="container-fluid" style="background:rgb(20%,30%,70%)">
container-fluid
</div>
<div class="row">
<div class="col-md-4" style="height:300px; background:url(/resource/images/1.jpg)no-repeat"></div>
<div class="col-md-2" style="height:300px; background:url(/resource/images/2.jpg)no-repeat"></div>
<div class="row col-md-6" style="height:300px;">
<div class="col-md-4" style=" background:rgb(30%,30%,40%)">
第一个标题
</div>
<div class="col-md-4" style="background:rgb(60%,30%,10%)">
第二个标题
</div>
</div>
</div>
</body>
</html>