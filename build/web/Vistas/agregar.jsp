<%-- 
    Document   : agregar
    Created on : 30 abr 2023, 19:19:14
    Author     : Felipe Romero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Separa Tu Paseo</h1>
            <br>
            <form action="Controlador_paseo">
                
                Cedula:<br>
                <input type="number" name="cedula"><br>
                Ida:<br>
                <input type="text" name="ida"><br>
                Vuelta:<br>
                <input type="text" name="vuelta"><br>
                Motivo:<br>
                <input type="text" name="motivo"><br>
                Ciudad Origen:<br>
                <input type="text" name="c_origen"><br>
                Ciudad Destino:<br>
                <input type="text" name="c_destino"><br>
                Presupuesto:<br>
                <input type="text" name="presupuesto"><br>
                Gasto Real:<br>
                <input type="text" name="gasto_real"><br>
                Transporte:<br>
                <input type="text" name="transporte"><br>
                Numero De personas:<br>
                <input type="text" name="n_personas"><br>
                
                <input type="submit" name="accion" value="AGREGAR"><br>
            </form>
        
        </div>
    </body>
</html>
