
package Interfaces;

import Modelo.Paseo;
import java.util.List;


public interface CRUDPaseo {
    
   public List listar();
   public Paseo list(int cedula);
   public boolean add(Paseo pas);
   public boolean edit(Paseo pas);
   public boolean eliminar(int cedula);  
}
