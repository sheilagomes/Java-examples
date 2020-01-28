<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar todos os usuários</title>
    </head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Profissão</th>
                <th>Local</th>
                <th colspan=2>Ação</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.id}" /></td>
                    <td><c:out value="${user.nome}" /></td>
                    <td><c:out value="${user.prof}" /></td>
                    <td><c:out value="${user.local}" /></td>
                    <td><a href="UserController?action=edit&id=<c:out value="${user.id}"/>">Atualizar</a></td>
                    <td><a href="UserController?action=delete&id=<c:out value="${user.id}"/>">Excluir</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="UserController?action=insert">Adicionar registro</a></p>
</body>
</html>