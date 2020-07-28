<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%String nomeEmpresa = (String)request.getAttribute("Empresa");
    System.out.println(nomeEmpresa);%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresas Criadas</title>
</head>
<body>
	Empresa <%= nomeEmpresa%> cadastrada
</body>
</html>