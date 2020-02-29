/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Arqui
 */
public class ventaBoletos extends Pelicula {
    
    private String hora;
    private int cant_Boletos;
    private char sala;

    public ventaBoletos(String hora, int cant_Boletos, char sala) {
        this.hora = hora;
        this.cant_Boletos = cant_Boletos;
        this.sala = sala;
    }

    public ventaBoletos() {
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCant_Boletos() {
        return cant_Boletos;
    }

    public void setCant_Boletos(int cant_Boletos) {
        this.cant_Boletos = cant_Boletos;
    }

    public char getSala() {
        return sala;
    }

    public void setSala(char sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "ventaBoletos{Id="+id+" Nombre= "+nombre +" Descripcion= "+descripcion +" Genero="+genero+ "hora=" + hora + ", cant_Boletos=" + cant_Boletos + ", sala=" + sala + '}';
    }
    

}

