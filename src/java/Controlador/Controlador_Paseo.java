/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Paseo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import modeloDAO.PaseoDAO;

/*import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/




public class Controlador_Paseo extends HttpServlet {

    String listar="vistas/listar.jsp";
    String add="vistas/agregar.jsp";
    String edit="vistas/editar.jsp";
    Paseo p=new Paseo();
    PaseoDAO dao=new PaseoDAO();
    int cedula;
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador_Paseo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador_Paseo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String ida=request.getParameter("ida");
            String vuelta=request.getParameter("vuelta");
            String motivo=request.getParameter("motivo");
            String c_origen=request.getParameter("c_origen");
            String c_destino=request.getParameter("c_destino");
            String presupuesto=request.getParameter("presupuesto");
            String gasto_real=request.getParameter("gasto_real");
            String transporte=request.getParameter("transporte");
            String n_personas=request.getParameter("n_personas");
            p.setIda(ida);
            p.setVuelta(vuelta);
            p.setMotivo(motivo);
            p.setC_origen(c_origen);
            p.setC_destino(c_destino);
            p.setPresupuesto(presupuesto);
            p.setGasto_real(gasto_real);
            p.setTransporte(transporte);
            p.setN_personas(n_personas);
            dao.add(p);
            acceso=listar;
        }
        
        
        
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idpas",request.getParameter("cedula"));
            acceso=edit;
        } 
        
        
        else if(action.equalsIgnoreCase("Actualizar")){
            cedula=Integer.parseInt(request.getParameter("cedula"));
            String ida=request.getParameter("ida");
            String vuelta=request.getParameter("vuelta");
            String motivo=request.getParameter("motivo");
            String c_origen=request.getParameter("c_origen");
            String c_destino=request.getParameter("c_destino");
            String presupuesto=request.getParameter("presupuesto");
            String gasto_real=request.getParameter("gasto_real");
            String transporte=request.getParameter("transporte");
            String n_personas=request.getParameter("n_personas");
            p.setIda(ida);
            p.setVuelta(vuelta);
            p.setMotivo(motivo);
            p.setC_origen(c_origen);
            p.setC_destino(c_destino);
            p.setPresupuesto(presupuesto);
            p.setGasto_real(gasto_real);
            p.setTransporte(transporte);
            p.setN_personas(n_personas);
            dao.edit(p);
            acceso=listar;
        }
        
        
        
        
        else if(action.equalsIgnoreCase("eliminar")){
            cedula=Integer.parseInt(request.getParameter("cedula"));
            p.setCedula(cedula);
            dao.eliminar(cedula);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
