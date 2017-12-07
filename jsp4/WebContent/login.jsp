<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<%!
%>
<!-- 수정수정수정!! -->
<script>
function checkValue(){
	var id = document.getElementById("id");
	var pwd = document.getElementById("pwd");
	if(id.value.trim()==""){
		alert("id를 입력해주세요.");
		id.focus();
		return false;
	}
	
	if(pwd.value.trim()==""){
		alert("비밀번호를 입력해주세요.");
		pwd.focus();
		return false;
	}
	return true;
}
function formSubmit(){
	var param = {};
	param["id"] = document.getElementById("id").value;
	param["pwd"] = document.getElementById("pwd").value;
	
	//alert(JSON.stringify(param));
	
	param = [{"id" : "test1", "pwd":"password1" },
		{"id" : "test2", "pwd":"password2" }];
	alert(param[1].id);
	alert(param[1].pwd);
}
</script>
<form method='post' action="/te.login" onsubmit="return checkValue()">
아이디 : <input type="text" name="id" id="id"><br>
비밀번호 : <input type="password" name="pwd" id="pwd"><br>
<input type="button" value="login" onclick="formSubmit()"> 
</form>
</body>
</html>





