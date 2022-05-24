<%@ page import="java.util.List" %>
<%@ page import="com.example.acao.Empresa" %><%--
  Created by IntelliJ IDEA.
  User: gian.ferreira
  Date: 23/05/2022
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/entrada" var="linkRemover"/>
<c:url value="/entrada" var="linkMostrar"/>
<html>
<head>
    <title>Lista Empresas now</title>
</head>
<body>
<h1>lista novinha</h1>
<c:if test="${not empty empresa}">
    Empresa ${empresa} cadastrada
</c:if>
<br>
    <ul>
        <c:forEach items="${empresas}" var="empresa">

            <li>
                ${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
                    <a href="${linkMostrar}?acao=MostraEmpresa&id=${empresa.id}">Editar</a>
                    <a href="${linkRemover}?acao=RemoveEmpresa&id=${empresa.id}">Remover</a>
            </li>

        </c:forEach>
    </ul>

</body>
</html>
