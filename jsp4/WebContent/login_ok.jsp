<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String testId = "test";
String testName = "홍길동";
String testPwd = "1234";
String msg ="";
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if(id.equals(testId)){
	if(pwd.equals(testPwd)){
		out.println(testName + "님 로그인에 성공하셨습니다.");
	}else{
		msg = "입력하신 비밀번호를 확인해주세요.";
	}
}else{
	msg = "입력하신 id[" + id + "]는 없는 아이디입니다.";
}

if(!msg.equals("")){
%>
<script>
alert("<%=msg%>");
location.href = "/login2.jsp";
</script>
<%
}
%>