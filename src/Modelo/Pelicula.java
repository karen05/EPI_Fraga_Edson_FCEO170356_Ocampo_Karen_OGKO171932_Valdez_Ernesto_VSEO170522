/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ExcepCine;
import Controlador.PeliculaController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vistas.Vista_Pelicula;

/**
 *
 * @author Arqui
 */
public class Pelicula /*implements Comparable*/{
    protected int id ;
    protected String nombre;
    protected String anio;
    protected String descripcion;
    protected String genero;

    
  ///////////////// Constructores ///////////////  
    public Pelicula(int id, String nombre, String anio, String descripcion, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public Pelicula() {
       
    }
    
  ///////////////// set and get /////////////// 
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    
  ///////////////// Metodos /////////////// 

    @Override
    public String toString() {
        return "Pelicula{" + "Id=" + id + ", nombre=" + nombre + ", anio=" + anio + ", descripcion=" + descripcion + ", genero=" + genero + '}';
    }
  
}
