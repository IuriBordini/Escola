<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap 101 Template</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <header id="cabecalho">
            <div class="container">
                <h1>header</h1>
            </div>
        </header>
        <jsp:include page="include/menu.jsp"></jsp:include>
        <div class="container" id="conteudo">
            <section class="col-md-12">
                <p>${mensagem}</p>
                <form class="form-horizontal" action="CadastrarCliente" method="POST">
                    <fieldset>

                        <!-- Form Name -->
                        <legend>Cadastro</legend>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="nome">Nome</label>  
                            <div class="col-md-4">
                                <input id="nome" name="nome" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="email">E-mail</label>  
                            <div class="col-md-4">
                                <input id="email" name="email" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="telefone">Telefone</label>  
                            <div class="col-md-4">
                                <input id="telefone" name="telefone" type="text" placeholder="" class="form-control input-md" required="">

                            </div>
                        </div>

                        <!-- Button -->
                        <div class="form-group">
                            <label class="col-md-4 control-label" for="botao"></label>
                            <div class="col-md-4">
                                <button id="botao" name="botao" class="btn btn-primary">Cadastrar</button>
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

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
