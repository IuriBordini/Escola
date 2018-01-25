<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- comentário -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="nome" scope="application" value="Daniel" />
<c:set var="valor1" value="200" />
<c:set var="valor2" value="500" />
<c:set var="total" value="${valor1+valor2}" />
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
                <h1>Hello, world! ${nome}</h1>
                <p>${valor1+valor2}</p>
                <p>${total}</p>
                
                <p>
                    
                    <c:if test="${valor1 > valor2}">
                        Valor 1 é maior                        
                    </c:if>
                    <c:if test="${valor2 > valor1}">
                        Valor 2 é maior                        
                    </c:if>                    
                     <c:if test="${valor2 == valor1}">
                        Valor 2 é igual a valor 1                        
                    </c:if>                         
                       
                </p>
                
          </div>
    </header>
    <jsp:include page="include/menu.jsp"></jsp:include>
    <div class="container" id="conteudo">
        <section class="col-md-3">
            <h2>Conteúdo</h2>
        </section>
       <section class="col-md-9">
            <h2>Conteúdo 2</h2>
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
