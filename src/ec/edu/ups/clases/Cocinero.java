/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.clases;

import java.util.Date;


/**
 *
 * Esta clase instancia los atributos y metodos de Cocinero
 * 
 * 
 * @author José Quinde
 */
public class Cocinero {
    
    //Declaracion de los atributos de la clase Cocinero en private
    
    private String nombre;
    private String apellido;
    private Date horaEntrada;
    private Date horaSalida;
    private String tipoCocinero;

     /**
     * 
     * getters y setters de la clase Cocinero 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getTipoCocinero() {
        return tipoCocinero;
    }

    public void setTipoCocinero(String tipoCocinero) {
        this.tipoCocinero = tipoCocinero;
    }
    
    /** 
    * Metodo que realiza el registro del Cocinero
    */
    public void registrarCocinero(){
    
    }
     /** 
    * Metodo que registra la hora de Entrada del Cocinero
    */   
    public void registrarEntrada(){
    
    }
    /** 
    * Metodo que realiza la hora de Salida del Cocinero
    */
    public void registrarSalida(){
    
    }
    /** 
    * El toString imprime todos los atributos de la clase Cocinero con sus respectivos datos
    */

    @Override
    public String toString() {
        return "Cocinero \n" 
                + "Nombre=" + nombre +"\n" 
                + "Apellido=" + apellido +"\n" 
                + "Hora Entrada=" + horaEntrada +"\n" 
                + "Hora Salida=" + horaSalida +"\n" 
                + "Tipo Cocinero=" + tipoCocinero ;
    }

    
}
