<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*"%>  
<%@ page import="java.sql.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%@ page import = "java.util.List, br.com.teste.cadastro.Cliente" %>
<%@ page import = " br.com.teste.banco.ConnectionFactory" %> 
<%@ page import = "java.util.ArrayList, br.com.teste.DAO.ClienteDAO" %>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Clientes</title>
</head>
<body>

Lista de Clientes<br>

<ul>
	<c:forEach items="${clientes}" var="cliente">
		<li>${cliente.nome} </li>
		<a href="/Projeto-cadastro/excluirCliente?id=${cliente.id}">remover</a>
		<a href="/Projeto-cadastro/mostraCliente?id=${cliente.id}">editar</a>
	</c:forEach>


</ul>
<br>
<br>
<a href="/Projeto-cadastro/formulario.jsp">Novo Cadastro</a><br>

</body>
</html>