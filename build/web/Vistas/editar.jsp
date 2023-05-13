
<%@page import="Modelo.Paseo"%>
<%@page import="ModeloDAO.PaseoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div>
             <%
              PaseoDAO dao=new PaseoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idpas"));
              Paseo p=(Persona)dao.list(cedula);
          %>
            <h1>Actualiza Tu Paseo</h1>
            <br>
            <form action="Controlador_paseo">
                                
                Ida:<br>
                <input type="text" name="ida" value="<%= p.getIda()%>"><br>
                Vuelta:<br>
                <input type="text" name="vuelta" value="<%= p.getVuelta()%>"><br>
                Motivo:<br>
                <input type="text" name="motivo" value="<%= p.getMotivo()%>"><br>
                Ciudad Origen:<br>
                <input type="text" name="c_origen" value="<%= p.getC_origen()%>"><br>
                Ciudad Destino:<br>
                <input type="text" name="c_destino" value="<%= p.getC_destino()%>"><br>
                Presupuesto:<br>
                <input type="text" name="presupuesto" value="<%= p.getPresupuesto()%>"><br>
                Gasto Real:<br>
                <input type="text" name="gasto_real" value="<%= p.getGasto_real()%>"><br>
                Transporte:<br>
                <input type="text" name="transporte" value="<%= p.getTransporte()%>"><br>
                Numero De personas:<br>
                <input type="text" name="n_personas" value="<%= p.getN_personas()%>"><br>
                <input type="hidden" name="cedula" value="<%= p.getcedula()%>">
                <input type="submit" name="accion" value="ACTIALIZAR"><br>
            </form>
            
            <<a href="Controlador_Paseo?accion=listar">REGRESAR</a>
        
        </div>
    </body>
</html>
