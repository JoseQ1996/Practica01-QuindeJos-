/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.principal;

import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Cocinero;
import ec.edu.ups.clases.Menu;
import ec.edu.ups.clases.Mesero;
import ec.edu.ups.clases.Pedido;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * Esla clase que corre el programa pide los datos a traves de la clase Scanner y los imprime,
 * 
 * @author José Quinde
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        /**
         * 
         * Se declara las variables y tambien se llama a las distinitas clases
         */
        Scanner input=new Scanner(System.in);
        int i= 1;
        int a;
        Cliente cliente= new Cliente ();
        Cocinero cocinero=new Cocinero();
        Menu menu=new Menu();
        Mesero mesero=new Mesero();
        Pedido pedido=new Pedido();
        
        // Bucle para mantener corriendo a el Menu hasta que se decida Salir
         while(i==1){
				    	//Imprime Menu
				        System.out.println("-----------------------------------------------------------------------");
				        System.out.println("|------------------------------RESTAURANTE-----------------------------|");
				        System.out.println("|                            1.Ingrese Cliente                         |");
				        System.out.println("|                            2.Ingrese Cocinero                        |");
				        System.out.println("|                            3.Ingrese Menu                            |");
                                        System.out.println("|                            4.Ingrese Mesero                          |");
                                        System.out.println("|                            5.Ingrese Pedido                          |");
                                        System.out.println("|                            6.Imprimir Cliente                        |");
				        System.out.println("|                            7.Imprimir Cocinero                       |");
				        System.out.println("|                            8.Imprimir Menu                           |");
                                        System.out.println("|                            9.Imprimir Mesero                         |");
                                        System.out.println("|                            10.Imprimir Pedido                        |");
                                        System.out.println("|                            11.Salir                                  |");
				        System.out.println("------------------------------------------------------------------------");
				        System.out.println("Ingrese Opcion:");
                                        //Ingresar la opcion que se quiere realizar
				        a=input.nextInt();
				        //un switch que ingresa dependiendo el valor seleccionado
				    switch(a){
				    case 1:{
                                        
                                        /**
                                         * Se guardan los datos del Cliente en la clase Cliente 
                                         */
                                        System.out.println("Ingrese nombre del Cliente:");
                                        cliente.setNombre(input.next());
                                        System.out.println("Ingrese apellido del Cliente:");
                                        cliente.setApellido(input.next());
                                        System.out.println("Ingrese direccion del Cliente");
                                        cliente.setDireccion(input.next());
                                        input.nextLine();
                                        System.out.println("Se a ingresado correctamente el Cliente");
                       				        break;
				    }
				    case 2:{
                                        
                                        /**
                                         * Se guardan los datos del Cocinero en la clase Cocinero
                                         */
				    	System.out.println("Ingrese nombre del Cocinero:");
                                        cocinero.setNombre(input.next());
                                        System.out.println("Ingrese apellido del Cocinero:");
                                        cocinero.setApellido(input.next());
                                        System.out.println("Ingrese Hora de Entrada Cocinero");
                                        String horaEn=input.next();
                                        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
                                        Date horaF = dateFormat.parse(horaEn);
                                        cocinero.setHoraEntrada(horaF);
                                        System.out.println("Ingrese Hora de Salida Cocinero");
                                        String horaSal=input.next();                                        
                                        Date horaF1 = dateFormat.parse(horaSal);
                                        cocinero.setHoraSalida(horaF1);
                                        System.out.println("Ingrese Tipo de Cocinero");
                                        cocinero.setTipoCocinero(input.next());
                                        input.nextLine();
                                        System.out.println("Se a ingresado correctamente el Cocinero");
				    	
				        break;
				    }
                                    case 3:{
                                        
                                        /**
                                         * Se guardan los datos del Menu en la clase Menu 
                                         */
				    	System.out.println("Ingrese nombre del Plato:");
                                        menu.setNombrePlato(input.next());
                                        System.out.println("Ingrese descripcion del Plato:");
                                        menu.setDescPlato(input.next());
                                        System.out.println("Ingrese Valor del Plato");
                                        menu.setValorPlato(input.nextDouble());
                                        input.nextLine();
                                        System.out.println("Se a ingresado correctamente el Menu");
                       				        break;
				    }
                                    case 4:{
                                        
                                        /**
                                         * Se guardan los datos del Mesero en la clase Mesero
                                         */
				    	System.out.println("Ingrese nombre del Mesero:");
                                        mesero.setNombre(input.next());
                                        System.out.println("Ingrese apellido del Mesero:");
                                        mesero.setApellido(input.next());
                                        System.out.println("Ingrese Hora de Entrada del Mesero");
                                        String horaEn1=input.next();
                                        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
                                        Date horaF = dateFormat.parse(horaEn1);
                                        mesero.setHoraEntrada(horaF);
                                        System.out.println("Ingrese Hora de Salida del Mesero");
                                        String horaSal1=input.next();                                        
                                        Date horaF1 = dateFormat.parse(horaSal1);
                                        mesero.setHoraSalida(horaF1);
                                        input.nextLine();
                                        System.out.println("Se a ingresado correctamente el Mesero");
                       				        break;
				    }
                                    case 5:{
                                        
                                        /**
                                         * Se guardan los datos del Pedido en la clase Pedido
                                         */
				    	System.out.println("Ingrese cantidad del Pedido:");
                                        pedido.setCantidad(input.nextInt());
                                        System.out.println("Ingrese hora del Pedido");
                                        String horaPe=input.next();  
                                        DateFormat dateFormat = new SimpleDateFormat("hh:mm");
                                        Date horaF1 = dateFormat.parse(horaPe);
                                        pedido.setHoraPedido(horaF1);
                                        System.out.println("Ingrese valor total del Pedido");
                                        pedido.setValorPedido(input.nextDouble());                                      
                                        input.nextLine();
                                        System.out.println("Se a ingresado correctamente el Pedido");
                       				        break;
				    }
                                    case 6:{
                                        
                                        /**
                                         * Se llaman a los datos guardados en la clase Cliente y se los imprime
                                         */
                                        System.out.println("Cliente");
                                        System.out.println("Nombre "+cliente.getNombre());
                                        System.out.println("Apellido "+cliente.getApellido());
                                        System.out.println("Direccion "+cliente.getDireccion());
                                        System.out.println("");
                                        System.out.println("Imprimir el toString");
                                        System.out.println("");
                                        System.out.println(cliente);
                       				        break;
				    }
                                     case 7:{
                                         
                                         /**
                                         * Se llaman a los datos guardados en la clase Cocinero y se los imprime
                                         */
				    	System.out.println("Cocinero");
                                        System.out.println("Nombre "+cocinero.getNombre());
                                        System.out.println("Apellido "+cocinero.getApellido());
                                        System.out.println("Hora de Entrada "+cocinero.getHoraEntrada());
                                        System.out.println("Hora de Salida "+cocinero.getHoraSalida());
                                        System.out.println("Tipo de Cocinero "+cocinero.getTipoCocinero());
                                        System.out.println("");
                                        System.out.println("Imprimir el toString");
                                        System.out.println("");
                                        System.out.println(cocinero);
                       				        break;
				    }
                                    case 8:{
                                        
                                        /**
                                         * Se llaman a los datos guardados en la clase Menu y se los imprime
                                         */
				    	System.out.println("Menu");
                                        System.out.println("Nombre del Plato "+menu.getNombrePlato());
                                        System.out.println("Descripcion del Plato "+menu.getDescPlato());
                                        System.out.println("Valor del Plato "+menu.getValorPlato());
                                        System.out.println("");
                                        System.out.println("Imprimir el toString");
                                        System.out.println("");
                                        System.out.println(menu);
                       				        break;
				    }
                                    case 9:{
                                        
                                        /**
                                         * Se llaman a los datos guardados en la clase Mesero y se los imprime
                                         */
				    	System.out.println("Mesero");
                                        System.out.println("Nombre "+mesero.getNombre());
                                        System.out.println("Apellido "+mesero.getApellido());
                                        System.out.println("Hora de Entrada "+mesero.getHoraEntrada());
                                        System.out.println("Hora de Salida "+mesero.getHoraSalida());
                                        System.out.println("");
                                        System.out.println("Imprimir el toString");
                                        System.out.println("");
                                        System.out.println(mesero);
                       				        break;
				    }
                                    case 10:{
                                        
                                        /**
                                         * Se llaman a los datos guardados en la clase Pedido y se los imprime
                                         */
				    	System.out.println("Pedido");
                                        System.out.println("Cantidad del Pedido "+pedido.getCantidad());
                                        System.out.println("Hora del Pedido "+pedido.getHoraPedido());
                                        System.out.println("Valor Total del Pedido  "+pedido.getValorPedido());
                                        System.out.println("");
                                        System.out.println("Imprimir el toString");
                                        System.out.println("");
                                        System.out.println(pedido);
                       				        break;
				    }
                                  
				    case 11:{
                                        
                                        /**
                                         * Se sale del programa 
                                         */
				        System.out.println("Gracias");
				        i=0;
				        break;
				    }
				    default:{
				        System.out.flush();        
				        System.err.println("Ingrese Opcion Valida");
				        break;
				    }
                                    }
                    }
    }
    
}
