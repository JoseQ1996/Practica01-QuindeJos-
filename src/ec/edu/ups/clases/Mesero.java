/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.clases;

import java.util.Date;


/**
 *
 * Esta clase instancia los atributos y metodos de Mesero
 * 
 * @author José Quinde
 */
public class Mesero {
    
    //Declaracion de los atributos de la clase Mesero en private
    
    private String nombre;
    private String apellido;
    private Date horaEntrada;
    private Date horaSalida;

     /**
     * 
     * getters y setters de la clase Mesero
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
    
    /** 
    * Metodo que registra la hora de Entrada del Mesero
    */
    public void registrarEntrada(){
        
    }
    
    /** 
    * Metodo que registra la hora de Salida del Mesero
    */
    public void registrarSalida(){
        
    }
    
    /** 
    * Metodo que registra los datos del Mesero
    */
    public void registrarMesero(){
        
    }
    /** 
    * El toString imprime todos los atributos de la clase Mesero con sus respectivos datos
    */

    @Override
    public String toString() {
        return "Mesero\n" 
                + "Nombre=" + nombre +"\n"
                + "Apellido=" + apellido+"\n"
                + "Hora Entrada=" + horaEntrada +"\n"
                + "HoracSalida=" + horaSalida ;
    }
    
    
}
