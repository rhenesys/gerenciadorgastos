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

		<div class="col-sm-12"
			style="text-align: center; margin: 0 auto;">
			<h1>Bem-vindo ${nomeusuario }</h1>

			<table class="table table-striped" style="width: 100%">
				<thead>
					<tr>
						<th>Saldo atual:</th>
						<th>R$ 0.00</th>
					</tr>
				</thead>
				
				<tbody>
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
				</tbody>
			</table>

		</div>

	</div>
	<div class="col-sm-1"></div>
</body>
</html>