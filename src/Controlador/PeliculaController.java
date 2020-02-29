/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pelicula;
import ei.CRUDinterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controlador.ExcepCine;

/**
 *
 * @author Arqui
 */
public class PeliculaController implements CRUDinterface<Pelicula> {

    @Override
    public boolean guardar(Pelicula obj) throws SQLException, ExcepCine{
        if(obj.getNombre()=="" || obj.getDescripcion()==""||obj.getGenero()==""){
             throw new ExcepCine("Campos incompletos");
        }else{
            boolean flag=false;
            String sql= "INSERT INTO Peliculas(nombre,descripcion,anio,genero)VALUES('"+obj.getNombre()+"','"+obj.getDescripcion()+"','"+obj.getAnio()+"','"+obj.getGenero()+"')";

            Conexion conn= new Conexion();        
            Statement sentencia=conn.crearConexion().createStatement();
            flag= sentencia.executeUpdate(sql) > 0;
            
            sentencia.close();
            conn.conexion.close();
            
            return flag;
        }
    }

    @Override
    public ArrayList<Pelicula> buscarPorNombre(String nombre) throws SQLException {
       
         ArrayList<Pelicula> pelicula = new ArrayList();
    
        String query = "SELECT *FROM Peliculas where nombre LIKE '%"+nombre+"%'";
        Conexion conn=new Conexion();

        Statement sentencia=conn.crearConexion().createStatement();
        ResultSet resultado=sentencia.executeQuery(query);

    while(resultado.next()){
        Pelicula peli = new Pelicula();
        peli.setId(resultado.getInt("id"));
        peli.setNombre(resultado.getString("nombre"));
        peli.setDescripcion(resultado.getString("descripcion"));
        peli.setAnio(resultado.getString("anio"));
        peli.setGenero(resultado.getString("genero"));

        pelicula.add(peli);
    }
        sentencia.close();
        conn.conexion.close();
        
    return pelicula;
        
        

    }

    @Override
    public boolean eliminar(int id) throws SQLException {
       
        String query;
        Conexion bd = new Conexion();
        boolean flag=false;
         
        
         query="DELETE FROM Peliculas WHERE id=?;";
         
         PreparedStatement sentenciaP=bd.crearConexion().prepareStatement(query);
         sentenciaP.setString(1,id+"");
         
         flag=sentenciaP.execute();
         sentenciaP.close();
         bd.conexion.close();

        return flag;
        
        
    }

    @Override
    public void modificar(Pelicula obj) throws SQLException, ExcepCine {
         if(obj.getNombre()=="" || obj.getDescripcion()==""||obj.getGenero()==""){
             throw new ExcepCine("Campos incompletos");
        }else{
              String query;
        Conexion bd = new Conexion();
        
        query = "UPDATE Peliculas SET nombre=?, descripcion=?, anio=?, genero=?"+ "WHERE id=?";
      
     
        PreparedStatement modificaSentencia = bd.crearConexion().prepareStatement(query); 
            
                System.out.println(obj.getId());
            modificaSentencia.setString(1, obj.getNombre());
            modificaSentencia.setString(2, obj.getDescripcion());
            modificaSentencia.setString(3, obj.getAnio());
            modificaSentencia.setString(4, obj.getGenero());
           // System.out.println(obj.getGenero());
            
            modificaSentencia.setInt(5, obj.getId());
           
         if(modificaSentencia.executeUpdate() > 0){
        
            JOptionPane.showMessageDialog(null, "Pelicula modificada", "Operación Exitosa", 
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
    
}
