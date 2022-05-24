<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServelet"/>
<!DOCTYPE html>
<html lang="pt_BR">
<head>
    <meta charset="UTF-8">
    <title>Formulario</title>
</head>
<body>


    <form action="${linkEntradaServelet}" method="post">
            Nome: <input type="text" name="nome">

            Data: <input type="text" name="data" />
            <input type="hidden" name="acao" value="NovaEmpresa"/>
            <input type="submit"/>
    </form>

</body>
</html>