<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*"%>  
<%@ page import="java.sql.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projeto</title>
</head>
<body>

Olá Cliente, Seja Bem-Vindo!<br>
Gostariamos de pedir para completar os quadros abaixo com seus dados para que possamos prosseguir!
<form action="adicionarCliente" method="post">
<br>
<br>
<br>Nome: <input type="text" name="nome"><br>
<br>Idade: <input type="number" name="idade"><br>
<br>Email: <input type="email" name="email"><br>
<br>Profissão: <input type=text name="profissao"><br>
<br>País: <input type=text name="pais"><br>
<br>Cidade: <input type=text name="cidade"><br>

<br><button type="submit" name= "enviar">Enviar</button>
</form>
</body>
</html>