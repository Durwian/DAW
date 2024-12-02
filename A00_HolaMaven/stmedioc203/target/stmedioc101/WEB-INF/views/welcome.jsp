<%-- 
    Document   : welcome
    Created on : 29 de nov. 2024, 12:27:48
    Author     : victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <title>Wellcome</title>
    </head>
    <body>
        <section>
            <div class="jumbotron"> 
                <div class="container">
                    <h1>${benvinguda}</h1>
                    <p>${tagline}</p>
                </div>
            </div>
        </section>
    </body>
</html>
