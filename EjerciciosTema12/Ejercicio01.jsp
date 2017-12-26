<%-- 

  Solución Ejercicio 1 Tema 12

  Crea una aplicación web en Java que muestre tu nombre y tus datos personales por pantalla. La página principal debe ser un archivo con la extensión jsp. Comprueba que se lanzan bien el servidor y el navegador web. Observa los mensajes que da el servidor. Fíjate en la dirección que aparece en la barra de direcciones del navegador.

  @author: Guillermo García

 --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
  <head>
    <title></title>
    <meta content="">
    <style></style>
  </head>
  <body>
    <% out.print("<p>Guillermo García Fernández</p>"); %>
    <% out.print("<p>Profesión Actual: Estudiante.</p>"); %>
  </body>
</html>