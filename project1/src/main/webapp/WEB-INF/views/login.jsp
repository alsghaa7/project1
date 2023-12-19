<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ page session='false' %>
<%@ page language='java' contentType='text/html; charset=utf-8'
	pageEncoding='utf-8' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<html>
<head>
<meta charset='UTF-8'>
<title>login</title>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
	$(document).ready(function () {
		$('#loginbtn').on('click', function() {
			loginChk();
		})
	});
	
	function loginChk() {
		const userInfo = {
			user_id: $('#user_id').val(),
			user_pswd: $('#user_pswd').val()
		}
		
		const userJson = JSON.stringify(userInfo);
		console.log(userJson);
	
		$.ajax({
			url: 'loginChk',
			type: 'POST',
			contentType: 'application/json;',
			data: userJson,
			success: function(data){
				alert(data.Msg);
			}
		});
	}
</script>
</head>
<body>
<h1>
	GroupWare!
</h1>

		아이디:<input type='text' id='user_id'><br/>
		비밀번호:<input type='password' id='user_pswd'><br/>
		<input type='submit' value='로그인' id='loginbtn'><br/>
	
<button id='btn'>클릭</button>
</body>
</html>