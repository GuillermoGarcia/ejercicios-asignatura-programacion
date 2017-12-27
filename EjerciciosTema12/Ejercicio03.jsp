<%-- 

  Solución Ejercicio 3 Tema 12

  Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del nombre introducido. El nombre se deberá recoger mediante un formulario.

  @author: Guillermo García

 --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
  <head>
    <title>Aprende Java con Ejercicios - Solución Ejercicio 03 Tema 12</title>
    <meta http-equiv="Content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="Ejercicio03.css">
  </head>
  <body>
    <form action="Ejercicio03.jsp" method="post" accept-charset="utf-8">
      <label for="nombre">Nombre: </label>
      <input type="text" name="nombre" value="" placeholder="Introduzca su Nombre...">
      <input type="submit" name="" value="Enviar">
    </form>
    <% if (request.getContentLength() > 0) {
        request.setCharacterEncoding("UTF-8");
        String nombre = request.getParameter("nombre");
        out.print("<p>¡Hola, <span>" + nombre + "</span>!</p>");
      }
    %>
  </body>
</html>