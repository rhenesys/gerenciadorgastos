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
	<div class="navbar navbar-default navbar-fixed-top navbarColorRegSeite"
		role="navigation" style="margin-top: 15px;">
		<div class="container">
			<div class="navbar-header">
				<span class="navbar-brand">Despesas do ${usuario.getPrimeiroNome() }</span>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-left">
					<li><a href="usuario.jsp?usuario=${usuario }">Perfil</a></li>
					<li><a href="#">Administracao</a></li>
					<li><a href="despesas.jsp">Logout</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div style="padding-top: 80px; height: 430px;">
		<div class="col-sm-1"></div>
		<div class="col-sm-10" style="text-align: center">

			<div class="col-sm-12" style="text-align: center; margin: 0 auto;">

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
	</div>
</body>
</html>