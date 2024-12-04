<%-- 
    Document   : medicaments
    Created on : 29 de nov. 2024, 14:01:18
    Author     : victor
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
        <title>Medicaments</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Medicaments</h1>
                    <p>Llista de medicaments en magatzem</p>
                </div>
            </div>
        </section>
        <section class="container">
            <c:forEach items="${medicaments}" var="medicament">
                <div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>${medicament.name}</h3>
                            <p>${medicament.description}</p>
                            <p>${medicament.price}</p>
                            <p>Hi ha ${medicament.stockQuantity} unitats en magatzem</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </section>
    </body>
</html>
