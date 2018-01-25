<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Cadastro de Professor</title>
        <jsp:include page="include/recursos.jsp"></jsp:include>
    </head>
    <body>

        <jsp:include page="include/menu.jsp"></jsp:include>
            <div class="container" id="conteudo">
                <section class="col-md-12">

                <c:if test="${not empty mensagem}">
                    <p class="alert alert-warning">${mensagem}</p>
                </c:if>
                <form class="form-horizontal" action="/Aula4/AtualizarProfessor" method="POST">
                    <fieldset>

                        <!-- Form Name -->
                        <legend>Atualização de Professor</legend>
                        <input value="${professor.id}" id="id" name="id" type="hidden">

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="nome">Nome</label>  
                            <div class="col-md-4">
                                <input value="${professor.nome}" id="nome" name="nome" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="area">Area</label>  
                            <div class="col-md-4">
                                <input value="${professor.area}" id="area" name="area" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="salario">Salario</label>  
                            <div class="col-md-4">
                                <input value="${professor.salario}" id="salario" name="salario" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="email">Email</label>  
                            <div class="col-md-4">
                                <input value="${professor.email}" id="email" name="email" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Button -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="botao"></label>
                            <div class="col-md-4">
                                <button id="botao" name="botao" class="btn btn-primary">Atualizar</button>
                            </div>
                        </div>

                    </fieldset>
                </form>  


            </section>

        </div>
        <footer id="rodape">
            <div class="container">
                <p>Rodapé</p>
            </div>        
        </footer>


    </body>
</html>
