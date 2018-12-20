<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página inicial - Despesas</title>
</head>
<body>
Faca o seu cadastro<br />
<form action="cadastrousuario.jsp" method="POST">
Nome:<input type="text" placeholder="Digite seu nome" name="nomeusuario" required><br />
Sobrenome:<input type="text" placeholder="Digite seu sobrenome" name="sobrenomeusuario" required><br />
Nickname:<input type="text" placeholder="Nickname" name="nickname" required><br />
Email:<input type="text" placeholder="Email" name="email" required><br />
Senha:<input type="password" placeholder="Digite uma senha" name="senha" required><br />
Repita sua senha:<input type="password" placeholder="Redigite a sua senha" name="redigitasenha" required><br />
<button>Cadastrar</button>
</form>
</body>
</html>