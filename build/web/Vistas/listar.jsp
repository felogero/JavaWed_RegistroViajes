
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Paseo"%>
<%@page import="java.util.List"%>
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
            <h1>Mi Paseo</h1>
            <a href="Controlador_Paseo?accion=agregar">Nuevo Paseo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>Cedula</th>
                        <th>Ida</th>
                        <th>Vuelta</th>
                        <th>Motivo</th>
                        <th>Origen</th>
                        <th>Destino</th>
                        <th>Presupuesto</th>
                        <th>Gasto Real</th>
                        <th>Transporte</th>
                        <th>Personas</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                
                  <%
                    PaseoDAO dao=new PaseoDAO();
                    List<Paseo>list=dao.listar();
                    Iterator<Paseo>iter=list.iterator();
                    Paseo pas=null;
                    while(iter.hasNext()){
                        pas=iter.next();
                    
                 %>                
                <tbody>
                    <tr>
                        <td><%= pas.getCedula()%></td>
                        <td><%= pas.getIda()%></td>
                        <td><%= pas.getVuelta()%></td>
                        <td><%= pas.getMotivo()%></td>
                        <td><%= pas.getC_origen()%></td>
                        <td><%= pas.getC_destino()%></td>
                        <td><%= pas.getPresupuesto()%></td>
                        <td><%= pas.getGasto_real()%></td>
                        <td><%= pas.getTransporte()%></td>
                        <td><%= pas.getN_personas()%></td>
                        <td>
                            <a href="Controlador_Paseo?accion=editar&cedula=<%=pas.getCedula()%>">Editar</a>
                            <<a href="CVontrolador_Paseo?accion=eliminar&cedula=<%=pas.getCedula()%>">Eliminar</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
