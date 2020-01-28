<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar novo usuário</title>
</head>
<body>

    <form method="POST" action='UserController' name="frmAddUser">
        ID : <input type="text" readonly="readonly" name="id"
            value="<c:out value="${user.id}" />" /> <br /> 
        Nome : <input
            type="text" name="nome"
            value="<c:out value="${user.nome}" />" /> <br /> 
        Prof : <input
            type="text" name="prof"
            value="<c:out value="${user.prof}" />" /> <br /> 
        Local : <input 
            type="text" name="local"
            value="<c:out value="${user.local}" />" /> <br />        
        <input
            type="submit" value="Enviar" />
    </form>
</body>
</html>