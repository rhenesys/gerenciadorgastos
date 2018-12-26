<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Página inicial - Despesas</title>
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
	<div class="col-sm-3" style=""></div>
	<div class="col-sm-6">

		Faca o seu cadastro
		<form action="usuario.jsp" method="POST">
			<div class="form-group">
				<label>Nome</label> <input type="text" class="form-control"
					id="nomeusuario" placeholder="Digite seu nome" name="nomeusuario"
					required> <label>Sobrenome</label> <input type="text"
					class="form-control" id="sobrenomeusuario"
					placeholder="Digite seu sobrenome" name="sobrenomeusuario" required>

				<label>Nickname</label> <input type="text" class="form-control"
					id="nickname" placeholder="Nickname" name="nickname" required>

				<label>Email</label> <input type="text" class="form-control"
					id="email" placeholder="Email" name="email" required> <label>Senha</label>
				<input type="password" class="form-control" id="senha"
					placeholder="Digite uma senha" name="senha" required> <label>Repita
					sua senha</label> <input type="password" class="form-control"
					id="redigitasenha" placeholder="Redigite a sua senha"
					name="redigitasenha" required>
					<input type="hidden" name="registro" />
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
	<div class="col-sm-3"></div>

</body>
</html>