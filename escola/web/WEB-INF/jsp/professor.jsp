<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema Alunos</title>
        <jsp:include page="include/recursos.jsp"></jsp:include>
    </head>
    <body>

        <jsp:include page="include/menu.jsp"></jsp:include>
        <div class="container" id="conteudo">
            <section class="col-md-12">
           
            <c:if test="${not empty mensagem}">
                <p class="alert alert-warning">${mensagem}</p>
            </c:if>
         <h1>Lista de Professores</h1>

            
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>NOME</th>
                    <th>Area</th>
                    <th>Salário</th>
                    <th>Email</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="professor"  items="${dados}">
                    <tr>
                        <td>${professor.id}</td>
                        <td>${professor.nome}</td>
                        <td>${professor.area}</td>
                        <td>${professor.salario}</td>
                        <td>${professor.email}</td>
                        <td><a href="VisualizarAluno/${professor.id}">Visualizar</a></td>
                        <td><a href="ExcluirAluno/${professor.id}">Excluir</a></td>
                    </tr>
                    
                </c:forEach>
            </table>
         <a class="btn btn-primary" href="/Aula4/CadastroProfessor">Novo Professor</a>
    </body>
</html>
