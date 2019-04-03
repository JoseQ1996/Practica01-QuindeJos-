/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.clases;

/**
 *
 * Esta clase instancia los atributos y metodos de Menu
 * 
 * @author José Quinde
 */
public class Menu {
   
    //Declaracion de los atributos de la clase Menu en private
    
    private String nombrePlato;
    private String descPlato;
    private double valorPlato;

     /**
     * 
     * getters y setters de la clase Menu
     */
    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getDescPlato() {
        return descPlato;
    }

    public void setDescPlato(String descPlato) {
        this.descPlato = descPlato;
    }

    public double getValorPlato() {
        return valorPlato;
    }

    public void setValorPlato(double valorPlato) {
        this.valorPlato = valorPlato;
    }
    
    /** 
    * Metodo que realiza el registro de los Platos
    */
    public void registrarPlato(){
        
    }
    
    /** 
    * Metodo que modifica un Plato
    */
    public void modificarPlato(){
         
    }
    
    /** 
    * Metodo que elimina un Plato 
    */
    public void eliminarPlato(){
        
    }
    /** 
    * El toString imprime todos los atributos de la clase Menu con sus respectivos datos
    */

    @Override
    public String toString() {
        return "Menu\n" 
                +"Nombre Plato=" + nombrePlato +"\n"
                + "Descripcion Plato=" + descPlato +"\n"
                + "Valor Plato=" + valorPlato;
    }
    
    
}
