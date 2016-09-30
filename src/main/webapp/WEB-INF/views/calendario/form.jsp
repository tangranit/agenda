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
	<form:form method="POST" commandName="eventosInformacoes">
		<form:hidden path="id" />
		<div>
			<label>Titulo</label>
			<form:input path="titulo" placeholder="titulo" />
			<form:errors path="titulo" />
		</div>
		<div>
			<label>Inicio</label>
			<form:input path="inicio" />
			<form:errors path="inicio" />
		</div>
		<div>
			<label>Fim</label>
			<form:input path="fim" />
			<form:errors path="fim" />
		</div>
		<div>
			<label>Recurso</label>
			<form:input path="recurso" />
			<form:errors path="recurso" />
		</div>
		<div>
			<label>Descricao</label>
			<form:textarea path="descricao" />
			<form:errors path="descricao" />
		</div>
		<button type="submit"
			onclick="location.href='${spring:mvcUrl('CC#novo').build()}'">Gravar</button>

	</form:form>
</body>
</html>