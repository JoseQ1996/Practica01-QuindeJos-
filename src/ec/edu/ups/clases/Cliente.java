/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.clases;

/**
 *
 * Esta clase instancia los atributos y metodos de Cliente
 * 
 * @author José Quinde
 */
public class Cliente {
    
    //Declaracion de los atributos de la clase Cliente en private
    
    private String nombre;
    private String apellido;
    private String direccion;
    
    /**
     * 
     * getters y setters de la clase Cliente 
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /** 
    * Metodo que realiza el registro del Cliente
    */
    public void registrarse(){
        
    }
    /** 
    * Metodo que realiza el pedido del Cliente
    */
    public void realizarPedido(){
        
    }
    /** 
    * Metodo que hace la reservacion del Cliente
    */
    public void realizarReservacion(){
        
    }
    
    /** 
    * El toString imprime todos los atributos de la clase Cliente con sus respectivos datos
    */
    @Override
    public String toString() {
        return "Cliente \n" 
                + "Nombre=" + nombre+"\n"
                + "Apellido=" + apellido +"\n"
                + "Direccion=" + direccion ;
    }
    
    
}
