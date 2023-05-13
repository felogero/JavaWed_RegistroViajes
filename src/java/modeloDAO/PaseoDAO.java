/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import Modelo.Paseo;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUDPaseo;




public class PaseoDAO implements CRUDPaseo {

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Paseo p=new Paseo();
    
    @Override
    public List listar() {
      ArrayList<Paseo>list=new ArrayList();
      String sql="select * from Paseo";
      try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Paseo pas=new Paseo();
                pas.setCedula(rs.getInt("cedula"));
                pas.setIda(rs.getString("ida"));
                pas.setVuelta(rs.getString("vuelta"));
                pas.setMotivo(rs.getString("motivo"));
                pas.setC_origen(rs.getString("c_origen"));
                pas.setC_destino(rs.getString("c_destino"));
                pas.setPresupuesto(rs.getString("presupuesto"));
                pas.setGasto_real(rs.getString("gasto_real"));
                pas.setTransporte(rs.getString("transporte"));
                pas.setN_personas(rs.getString("n_personas"));
                list.add(pas);
            }
        } catch (Exception e) {
        }
        return list;
    
    }

    @Override
    public Paseo list(int cedula) {      
      
      String sql="select * from Paseo where cedula="+cedula;
      try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setCedula(rs.getInt("cedula"));
                p.setIda(rs.getString("ida"));
                p.setVuelta(rs.getString("vuelta"));
                p.setMotivo(rs.getString("motivo"));
                p.setC_origen(rs.getString("c_origen"));
                p.setC_destino(rs.getString("c_destino"));
                p.setPresupuesto(rs.getString("presupuesto"));
                p.setGasto_real(rs.getString("gasto_real"));
                p.setTransporte(rs.getString("transporte"));
                p.setN_personas(rs.getString("n_personas"));
                
            }
        } catch (Exception e) {
        }
        return p;
        
        }

    @Override
    public boolean add(Paseo pas) {
           String sql="insert into paseo(cedula, ida, vuelta, motivo, c_origen"
                   + "c_destino, presupuesto, gasto_real, transporte, n_personas)"
                   + "values('"+pas.getCedula()+"','"+pas.getIda()+"','"+pas.getVuelta()+"'"
                   + ",'"+pas.getMotivo()+"','"+pas.getC_origen()+"','"+pas.getC_destino()+"'"
                   + ",'"+pas.getPresupuesto()+"','"+pas.getGasto_real()+"','"+pas.getTransporte()+"'"
                   + ",'"+pas.getN_personas()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
        
    }

    @Override
    public boolean edit(Paseo pas) {
        
        String sql="update paseo set cedula='"+pas.getCedula()+"',ida='"+pas.getIda()+"',vuelta='"+pas.getVuelta()+"'"
                   + ",motivo='"+pas.getMotivo()+"',c_origen='"+pas.getC_origen()+"',c_destino='"+pas.getC_destino()+"'"
                   + ",presupuesto='"+pas.getPresupuesto()+"',gasto_real'"+pas.getGasto_real()+"',transporte='"+pas.getTransporte()+"'"
                   + ",n_personas'"+pas.getN_personas()+"'where cedula="+pas.getCedula();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;        
        
        }

    @Override
    public boolean eliminar(int cedula) {
    
        String sql ="delete from paseo where cedula="+cedula;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
        } catch (Exception e) {
        }
        return false;
    }
    
}
