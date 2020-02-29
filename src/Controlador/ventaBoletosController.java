/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ventaBoletos;
import ei.CRUDinterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Arqui
 */
public class ventaBoletosController implements CRUDinterface<ventaBoletos>  {

 @Override
    public boolean guardar(ventaBoletos obj) throws SQLException,ExcepCine {
        if(obj.getCant_Boletos()==0){
            throw new ExcepCine("La Cantidad de boletos no puede ser Cero");
        }else{
        }
                System.out.println(obj.getHora().toString());
        boolean flag=false;
            String sql= "INSERT INTO VentaBoletos(nombre,genero,hora,cant_Boletos,sala)VALUES('"+obj.getNombre()+"','"+obj.getGenero()+"','"+obj.getHora().toString()+"',"+obj.getCant_Boletos()+",'"+obj.getSala()+"')";

            Conexion conn= new Conexion();        
            Statement sentenciaB=conn.crearConexion().createStatement();
            flag= sentenciaB.executeUpdate(sql) > 0;
            
            sentenciaB.close();
            conn.conexion.close();
            
            return flag;
        
    }
    
        @Override
    public ArrayList<ventaBoletos> buscarPorNombre(String nombre) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<ventaBoletos> Boletos = new ArrayList();
        
        String query = "SELECT *FROM ventaboletos where nombre LIKE '%"+nombre+"%'";
        Conexion conn=new Conexion();
        
        Statement sentencia=conn.crearConexion().createStatement();
        ResultSet resultado=sentencia.executeQuery(query);

    while(resultado.next()){
        ventaBoletos bol = new ventaBoletos();
        bol.setId(resultado.getInt("id"));
        bol.setNombre(resultado.getString("nombre"));
        bol.setGenero(resultado.getString("genero"));
        bol.setHora(resultado.getString("hora"));
        bol.setCant_Boletos(resultado.getInt("cant_Boletos"));
        
        
        bol.setSala(resultado.getString("hora").charAt(0));
        Boletos.add(bol);
    }
        sentencia.close();
        conn.conexion.close();
        
    return Boletos;
    }

    
    @Override
    public boolean eliminar(int id) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String query;
        Conexion bd = new Conexion();
        boolean flag=false;
         
        
         query="DELETE FROM ventaboletos WHERE id=?;";
         
         PreparedStatement sentenciaP=bd.crearConexion().prepareStatement(query);
         sentenciaP.setString(1,id+"");
         
         flag=sentenciaP.execute();
         sentenciaP.close();
         bd.conexion.close();

        return flag;
    
    }


    @Override
    public void modificar(ventaBoletos obj) throws SQLException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       String query;
        Conexion bd = new Conexion();
        
        query = "UPDATE ventaboletos SET nombre=?, genero=?, hora=?, cant_Boletos=?, sala=?"  + "WHERE id=?";
      
         PreparedStatement modificaSentencia = bd.crearConexion().prepareStatement(query); 
            
                System.out.println(obj.getId());
            modificaSentencia.setString(1, obj.getNombre());
            modificaSentencia.setString(2, obj.getGenero());
            modificaSentencia.setString(3, obj.getHora());
            modificaSentencia.setInt(4, obj.getCant_Boletos());
            
            String a=Character.toString( obj.getSala()   );
            
            modificaSentencia.setString(5, a);
            modificaSentencia.setInt(6, obj.getId());
           // System.out.println(obj.getGenero());
           
           
             if(modificaSentencia.executeUpdate() > 0){
        
            JOptionPane.showMessageDialog(null, "Boleto modificada", "Operación Exitosa", 
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.", "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
        
        }
        
//         modificaSentencia.execute();
         bd.conexion.close();
           
           
           
            
    }


   
   
    
    
    
}
