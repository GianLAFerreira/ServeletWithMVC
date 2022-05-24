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
            Login: <input type="text" name="login">

            Senha: <input type="password" name="senha" />
            <input type="hidden" name="acao" value="Login"/>
            <input type="submit"/>
    </form>

</body>
</html>