/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * Esta clase instancia los atributos y metodos de Pedido
 * 
 * @author José Quinde
 */
public class Pedido {
    
    //Declaracion de los atributos de la clase Pedido en private
    
    private int cantidad;
    private Date horaPedido;
    private double valorPedido;

     /**
     * 
     * getters y setters de la clase Pedido
     */
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Date horaPedido) {
        this.horaPedido = horaPedido;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }
    
    /** 
    * Metodo que registra los datos del Pedido
    */
    public void registrarPedido(){
        
    }
    
    /** 
    * Metodo que modifica los datos del Pedido
    */
    public void modificarPedido(){
        
    }
    
    /** 
    * Metodo que entrega la hora en la que se da el Pedido
    */
    public void entregarPedido() {
        
    }
    /** 
    * El toString imprime todos los atributos de la clase Pedido con sus respectivos datos
    */

    @Override
    public String toString() {
        return "Pedido\n" 
                +"Cantidad=" + cantidad + "\n"
                +"Hora Pedido=" + horaPedido +"\n"
                +"Valor Pedido=" + valorPedido ;
    }
    
    
}
