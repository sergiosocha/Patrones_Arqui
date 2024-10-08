# PATRONES DE DISEÑO

Identificar patrones de diseño para los respectivos problemas


## Instrucciones
  + Cree un repositorio de github público y en el readme agregue los estudiantes del trabajo
  + Por cada uno de los problemas del PDF adjunto entregue:
      + Cual patrón escogió
      + Diagrama de clases
      + Código del ejercicio.
  + Todos deberán estar codificados en el mismo lenguaje, se acepta (C#, Python, Java)



Integrantes: 
+ Cristian Steven Soto Zapata,
+ Sebastian Piñeros Castellanos
+ Sergio Eduardo Socha Mendoza


## Diagramas de clase:

##### Los diagramas se encuentran dentro de cada carpeta de solucion en formato JPEG


### SOLUCION 1:
Prototype
#
Se seleccionó el patrón de diseño Prototype ya que el problema requería la creación de múltiples objetos, en este caso los héroes, teniendo la necesidad de crear un sistema de clonación de personajes. Por lo tanto, recurrimos al patrón Prototype, ya que nos permite copiar objetos existentes sin que el código dependa de sus clases.


![Diagrama del proceso](./src/Diagramas/Solucion1_Heroe.jpg)


### SOLUCION 2:
Observer
#
El patrón Observer es el más adecuado para la problemática presentada, ya que permite notificar a varios objetos sobre cualquier evento que ocurra en el objeto que están observando. Esto nos permite notificar a múltiples dispositivos sin necesidad de que el sujeto principal esté acoplado a ellos, lo que facilita la flexibilidad y el crecimiento del sistema.

![Diagrama del proceso](./src/Diagramas/Solucion2_Notificaciones.jpg)
### SOLUCION 3:
#### Patron de diseño seleccionado: 
Template Method
#
Este se ajusta segun las necesidades que se tenian para el desarrollo, ya que segun este podemos definir la estructura de la orden en una clase base y que las demas clases que heredan, solo implementen algunas funciones especificas
#
![Diagrama del proceso](./src/Diagramas/Solucion3_restaurante.jpg)

### SOLUCION 4:
### Patron de diseño seleccionado
Command
#
Para este problema es necesario de un patron que encapsule acciones para traerlas nuevamente y que permita la extensión del codigo de forma eficiente. Command permite este encapsulamiento de solicitudes y las registra, este solo necesita conocer el comando que debe ejecutar por lo que desacopla el invocador de los objetos, y estos comandos se pueden agragar sin modificar todo el codigo.
#

![Diagrama del proceso](./src/Diagramas/Solucion4_tareas.jpg)

### SOLUCION 5:
#### Patron de diseño seleccionado: 
Decorator
#
Teniendo en cuenta que epara este problema se plantea un patron que permita agregar nuevas funcionalidades a objetos existentes, decorator nos permite agregas estas caracteristicas a las habitaciones de hotel de manera dinamica
#

![Diagrama del proceso](./src/Diagramas/Solucion5_Hotel.jpg)



