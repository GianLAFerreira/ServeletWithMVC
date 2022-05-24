<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt_BR">
<head>
    <meta charset="UTF-8">
    <title>Nova Empresa</title>
</head>
    <body>
    <c:if test="${not empty empresa}">
        Empresa ${empresa} cadastrada
    </c:if>
    <c:if test="${empty empresa}">
        Empresa não cadastrada
    </c:if>

    </body>
</html>