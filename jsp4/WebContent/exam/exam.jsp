<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ include file="/common/header.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>리스트 테스트</title>
</head>
<body>
<%
ArrayList<HashMap<String,String>> al;
al = new ArrayList<HashMap<String,String>>();

HashMap<String,String> hm = new HashMap<String,String>();
hm.put("name","홍길동");
hm.put("age","33");
al.add(hm);

/* HashMap<String,String> hm1 = new HashMap<String,String>(); */
hm.put("name","채선영");
hm.put("age","30");
al.add(hm);
%>

<table border="1">
	<tr>
		<th><%=str1%></th>
		<th><%=str2%></th>
	</tr>


<%
for(HashMap<String,String> map : al){
	out.println("<tr>");
	out.println("<td>"+ map.get("name")+"</td>");
	out.println("<td align='center'>"+ map.get("age")+"</td>");
	out.println("</tr>");
	
}
%>
</table>
</body>
</html>