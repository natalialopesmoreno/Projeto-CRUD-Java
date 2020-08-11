<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editando Cliente</title>
</head>
<body>
		<form action="editarCliente" >
		
		<br>Nome:<input type="text" name = "nome" value="${cliente.nome}"/><br>
		<br>Idade: <input type="number" name="idade" value="${cliente.idade}"/><br>
		<br>Email: <input type="email" name="email" value="${cliente.email}"/><br>
		<br>Profissão: <input type=text name="profissao" value="${cliente.profissao}"/><br>
		<br>País: <input type=text name="pais" value="${cliente.pais}"/><br>
		<br>Cidade: <input type=text name="cidade" value="${cliente.cidade}"/><br>

<br><button type="submit" name= "alterar">Alterar</button>
		<input type ="hidden" name="id" value="${cliente.id}"/>
		</form>

</body>
</html>






