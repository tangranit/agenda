<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CS Agenda</title>
</head>
<body>
	<form:form method="POST" commandName="grupo">
		<form:hidden path="id" />
		<div>
			<label>Grupo:</label>
			<form:input path="nomeGrupo" placeholder="nomeGrupo" />
			<form:errors path="nomeGrupo" />
		</div>
		<div>
			<label>Descrição:</label>
			<form:input path="descricao" placeholder="descricao" />
			<form:errors path="descricao" />
		</div>
		<button type="submit"
			onclick="location.href='${spring:mvcUrl('GC#create').build()}'">Gravar</button>

	</form:form>
</body>
</html>