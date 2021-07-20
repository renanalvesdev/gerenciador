
<%@ page
	import="java.util.List, br.com.alura.gerenciador.model.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Java Standard Taglib</title>
</head>
<body>

	<a href="entrada?acao=Logout">Sair</a>


	Usuario Logado: ${usuarioLogado.login}
	
	<br/>
	<br/>
	<br/>
	<br/>

	<c:if test="${not empty empresa}">
		Empresa ${empresa} cadastrada com sucesso !
	</c:if>
	
	<a href="/gerenciador/entrada?acao=FormNovaEmpresa">+ Nova Empresa</a><br/><br/>
	
	Lista de empresas: <br/>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>${empresa.nome}- <fmt:formatDate
					value="${empresa.dataCadastro}" pattern="dd/MM/yyyy" />
			
			<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id}">editar</a>		
			<a href="/gerenciador/entrada?acao=RemoveEmpresa&id=${empresa.id}">remover</a>					
			</li>
		</c:forEach>
	</ul>
</body>
</html>
</body>
</html>