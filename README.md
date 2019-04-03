# Practica01-QuindeJos-
Practica 1 de Programación Aplicada
ACTIVIDADES DESARROLLADAS
INTRUCCIONES: A partir de ejemplos de la vida real relacionados con "restaurantes". Desde un punto de vista de objetos, identifique sus propiedades y comportamientos. Luego, abstráigalos y represéntelos gráficamente como clases basado en UML. Posterior, codifique en el lenguaje de programación JAVA y manipule dichos objetos desde una clase principal. Finalmente, sincronice su código implementado con GitHub.
1.	Describir 10 objetos relacionados a tema de Restaurantes.
1.- Cliente: Persona que entra al restaurante y requiere de un servicio para poder satisfacer su necesidad de comer.
2.- Menú: El menú del día que ofrece el restaurante en donde se visualizan los distintos platos que se sirven en el local.
3.- Pedido: Lo que el cliente pide para comer es realizado por el mesero, puede contener varios platos.
4.- Mesero: Persona que realiza el servicio al cliente, le da información sobre el menú del día y también recibe el pedido del cliente.
5.- Forma de Pago: Indica la forma en la que va a cancelar el cliente lo consumido.
6.- Factura: Es un documento donde se da a conocer la información del cliente y lo que consumió al igual que el valor que tiene que pagar.
7.- Cocinero: Persona que realiza los platos y los menús del día en el restaurante.
8.- Plato: Es lo que va a comer el cliente cuenta con una serie de ingredientes.
9.- Mesa: Lugar donde se sienta el cliente, algunos restaurantes cuentan con numeración de mesas para saber a qué mesa pertenece el pedido.
10.- Ingredientes: Un ingrediente es con lo que se prepara un plato, existen varios ingredientes en un restaurante para realizar una variedad de platos.

2.	De los 10 objetos descritos en el paso 1, abstraer 5 de ellos en clases y diagramarlas con tres atributos y tres métodos mínimo para cada clase (los métodos getter y setter no cuentan).

Se escogió las clases de Cliente, Mesero, Cocinero, Pedio y Menú para realizar el diagrama de UML y también se agregaron 3 métodos diferentes para cada clase
 
3. Crear un proyecto Java en Netbeans llamado Practica01-SuApellidoNombre y sobre el mismo codificar las 5 clases seleccionadas en java utilizando: atributos, métodos y encapsulamiento con los métodos getters and setters.  En relación a los métodos (comportamientos) estos solo deben ser declarados es decir no se requiere del procedimiento.
Todas las clases y métodos deben contar con la documentación del código fuente. Además, se debe nombrar correctamente las clases, métodos, atributos y/o paquetes según las buenas prácticas de programación de las convenciones de los códigos de java.
 
 Se creó un paquete en donde separe las clases de Cliente,Cocinero,Menu.Mesero y Pedido y se instancio los objetos descritos en el diagrama de UML también se creó una paquete que tenga la clase main.

4. Implementar el método toString() en cada clase.
•	toString de la Clase Cliente
public String toString() {
        return "Cliente \n" 
                + "Nombre=" + nombre+"\n"
                + "Apellido=" + apellido +"\n"
                + "Direccion=" + direccion ;
    }
 
5. Programar una clase principal (tipo main) que permita crear un objeto (instanciar) de cada clase referida en el punto anterior, estableciendo/seteando los datos/valores ingresados por el usuario (usando la clase Scanner) y posterior muestre dicha información del objeto en la consola de Netbeans.
Utilizar las clases System.in y System.out para entrada y salida de datos.
•	Ingreso de Valores en la Clase Cocinero a través de la Clase Scanner utilizando el System.in
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




•	Utilizando el System.out para la salida de datos de la Clase Cocinero
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
6. Crear un repositorio en GitHub y subir el código del proyecto de NetBeans. En el archivo README del repositorio debe constar la misma información del informe de resultados de la práctica que se indica en el siguiente punto.
 
Nombre de Usuario: JoseQ1996
Https del Repositorio: https://github.com/JoseQ1996/Practica01-QuindeJos-.git


CONCLUSIONES:
Como conclusión final puedo decir que a través de esta práctica se ha aprendido a realizar los getters y setters de atributos de una clase así mismo también se aprendo a llamar clases a otra clase que este en otro paquete.
Pienso que al poner en practica esto nos sería muy útil ya que así el código de un programa no se vería saturado en un clase main, y se podría crear varias clases que tengan métodos que realicen varias operaciones y así solo podamos llamarlos a la clase main para que se ejecuten.
RECOMENDACIONES:
Como recomendación podría decir que se debería utilizar siempre esta forma de realizar los programas para así poder tener una mejor comprensión de un programa sin mucha línea de código saturada en una clase.
