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
            
            <h1>Lista de Alunos</h1>

            
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>NOME</th>
                    <th>MATRÍCULA</th>
                    <th>TELEFONE</th>
                    <th>ENDEREÇO</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach var="aluno"  items="${dados}">
                    <tr>
                        <td>${aluno.id}</td>
                        <td>${aluno.nome}</td>
                        <td>${aluno.matricula}</td>
                        <td>${aluno.endereco}</td>
                        <td>${aluno.telefone}</td>
                        <td><a href="VisualizarAluno/${aluno.id}">Visualizar</a></td>
                        <td><a href="ExcluirAluno/${aluno.id}">Excluir</a></td>
                    </tr>
                    
                </c:forEach>
            </table>
            
            
           


            </section>

        </div>
        <footer id="rodape">
            <div class="container">
                <p>Rodapé</p>
            </div>        
        </footer>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
