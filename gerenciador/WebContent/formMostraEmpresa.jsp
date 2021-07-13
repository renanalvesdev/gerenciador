<?xml version="1.0" encoding="UTF-8" ?>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>

<form action="${linkEntradaServlet}" method="post">
	<body>
		Nome:
		<input type="text" name="nome" value="${empresa.nome}" /> Data
		Abertura:
		<input type="text" name="data"
			value="<fmt:formatDate
					value="${empresa.dataCadastro}" pattern="dd/MM/yyyy" />" />
		<input type="hidden" name="id" value="${empresa.id}" />
		<input type="hidden" name="acao" value="AlteraEmpresa" />
		<input type="submit" />
</form>

</body>

</html>
