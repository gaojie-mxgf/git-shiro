<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>

</head>
<body> 
	<form 	action="${pageContext.request.contextPath }/login" method="post" >
		用户名：<input type="text" name="username" /> <br/>
		密码：<input type="text" name="password" /> <br/>
		<input type="submit" value="登陆" />
	</form>
</body>

</html>