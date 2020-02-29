/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ei;

import Controlador.ExcepCine;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface CRUDinterface<CLASS> {
    
     public boolean guardar(CLASS CLASS) throws SQLException, ExcepCine; 
    
     public ArrayList<CLASS> buscarPorNombre(String nombre) throws SQLException, ExcepCine; 
     
     public boolean eliminar(int id)throws SQLException, ExcepCine; 
     
     public void modificar(CLASS obj) throws SQLException,ExcepCine;
    
}
