<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<p>Bem vindo ao nosso gerenciador de empresas!</p>

<c:if test="${not empty usuarioLogado}">
	Logado como ${usuarioLogado.email}<br/>
</c:if>

<form action="tarefas" method="post">
	<input type="hidden" name="tarefa" value="Logout">
    <input type="submit" value="Logout" />
</form>

<h3>Nova empresa</h3>
<form action="tarefas" method="POST">
	<input type="hidden" name="tarefa" value="NovaEmpresa">
	<label for="nome">Nome:</label><br/>
	<input type="text" id="nome" name="nome"/><br/>
	<br/>
	<input type="submit" value="Enviar"/>
</form>

<h3>Buscar empresas</h3>
<form action="tarefas" method="POST">
	<input type="hidden" name="tarefa" value="BuscaEmpresa">
	<label for="filtro">Filtro:</label><br/>
	<input type="text" id="filtro" name="filtro"/><br/>
	<br/>
	<input type="submit" value="Buscar"/>
</form>

<h3>Login</h3>
<form action="tarefas" method="POST">
	<input type="hidden" name="tarefa" value="Login">

	<label for="email">E-mail:</label><br/>
	<input type="text" id="email" name="email"/><br/>
	<br/>
	<label for="senha">Senha:</label><br/>
	<input type="password" id="senha" name="senha"/><br/>
	<br/>

	<input type="submit" value="Enviar"/>
</form>

</body>
</html>