<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<meta charset="ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<body>
	<div class="col-sm-4"></div>
	<div class="col-sm-4">

		<form action="usuario.jsp?acessar=true" method="POST">
			<div class="panel-group" style="padding-top: 3em; max-width: 80;">
				<div class="panel panel-default">
					<div class="form-group">
						<div class="panel-heading">
							<label>Login</label>
						</div>
						<div class="panel-body" style="min-height: 10; max-height: 10;">
							<input type="text" class="form-control" id="email" name="email"
								placeholder="Email"> <input type="password"
								class="form-control" id="senha" name="senha" placeholder="Senha">
							<button type="submit" class="btn btn-primary">Entrar</button>
							<div>
								<a href="cadastro.jsp">Registrar-se</a>
							</div>
							<div>
								<a href="#">Esqueceu seus dados?</a>
							</div>
						</div>

					</div>
				</div>
			</div>
		</form>
	</div>
<div class="col-sm-4"></div>
</body>
</html>