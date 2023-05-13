/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Felipe Romero
 */
public class Paseo {
    
     int cedula;
     String ida;
     String vuelta;
     String motivo;
     String c_origen;
     String c_destino;
     String presupuesto;
     String gasto_real;
     String transporte;
     String n_personas;

    public Paseo() {
    }

    public Paseo(String ida, String vuelta, String motivo, String c_origen, String c_destino, String presupuesto, String gasto_real, String transporte, String n_personas) {
        this.ida = ida;
        this.vuelta = vuelta;
        this.motivo = motivo;
        this.c_origen = c_origen;
        this.c_destino = c_destino;
        this.presupuesto = presupuesto;
        this.gasto_real = gasto_real;
        this.transporte = transporte;
        this.n_personas = n_personas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getVuelta() {
        return vuelta;
    }

    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getC_origen() {
        return c_origen;
    }

    public void setC_origen(String c_origen) {
        this.c_origen = c_origen;
    }

    public String getC_destino() {
        return c_destino;
    }

    public void setC_destino(String c_destino) {
        this.c_destino = c_destino;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getGasto_real() {
        return gasto_real;
    }

    public void setGasto_real(String gasto_real) {
        this.gasto_real = gasto_real;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getN_personas() {
        return n_personas;
    }

    public void setN_personas(String n_personas) {
        this.n_personas = n_personas;
    }


    
    
}
