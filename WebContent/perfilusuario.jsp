<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Despesas</title>
<link rel="stylesheet" type="text/css" href="CSS/estilo.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="col-sm-1"></div>
	<div class="col-sm-10" style="text-align: center">
		<div class="col-sm-1" style="background-color:#33dd33;">l</div>
		<div class="col-sm-10" style="display: inline-block; background-color:#dfdfdf;">
			<h1>Seja bem-vindo: ${nomeusuario }</h1>
			
			<table border=1 style="width:60%">
				<tr>
					<td>Saldo atual:</td>
					<td>R$ 0.00</td>
				</tr>
				<tr>
					<td colspan="2">Próximos débitos</td>
				</tr>
				<tr>
					<td>Evento</td>
					<td>Vencimento</td>
				</tr>
				<tr>
					<td>Boleto do Banco</td>
					<td>DATA
				</tr>
				<tr>
					<td>Condominio</td>
					<td>DATA</td>
				</tr>
			</table>
			
		</div>
		<div class="col-sm-1" style="background-color:#ef13ae;">r</div>
	</div>
	<div class="col-sm-1"></div>
</body>
</html>