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
	<form:form method="POST" commandName="recurso">
		<form:hidden path="id" />
		<div>
			<label>Nome:</label>
			<form:input path="nome" placeholder="nome" />
			<form:errors path="nome" />
		</div>
		<label>Grupo</label>
		<form:select path="grupo.id" items="${grupos}"
			itemValue="id" itemLabel="nomeGrupo" multiple="false"
			class="span12">
		</form:select>
		<button type="submit"
			onclick="location.href='${spring:mvcUrl('RC#create').build()}'">Gravar</button>

	</form:form>
</body>
</html>