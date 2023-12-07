<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<button id="btn">클릭</button>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document).ready(function() {
	$("#btn").click(function() {
		getUsers();
	});
});
	
function getUsers(){   
		console.log(":::호출");         
            $.ajax({
                type:"get",  // fetch의 method 기능
                url: "http://localhost:8080/test", // json 넣어놨음
                dataType:"json" 
   			   // 메타데이터 타입을 명시해주면, ajax가 자동으로 js오브젝트로 파싱해준다 

                // 성공
            }).done((abc)=>{  
                console.log(abc);
            })
      			// 실패
            .fail((err)=>{
                console.log(err);
                
            });  // 실패시 - 상태코드 200 아닐때  // done + fail 은 콜백
};
</script>