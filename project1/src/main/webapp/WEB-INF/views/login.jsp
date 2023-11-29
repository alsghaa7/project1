<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<html>
<head>
<meta charset="UTF-8">
	<title>login</title>
</head>
<body>
	
<h1>
	GroupWare!
</h1>

<form action="login_chk.jsp" method="post">
		아이디:<input type="text" name="user_id"><br/>
		비밀번호:<input type="password" name="user_pswd"><br/>
		<input type="submit" value="로그인"><br/>
	</form>

</body>
</html>
