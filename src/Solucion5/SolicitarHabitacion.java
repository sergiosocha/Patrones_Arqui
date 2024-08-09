

public class SolicitarHabitacion {


    public static void main(String[] args){
        Habitacion mihabitacion = new HabitacionBasica();


        System.out.println(mihabitacion.getDescripcion() + "Costo de habitacion: " + mihabitacion.costo());

        mihabitacion = new FlowerDecorator(mihabitacion);
        System.out.println(mihabitacion.getDescripcion() + "Costo de flores " + mihabitacion.costo());

        mihabitacion = new ChocolateDecorator(mihabitacion);
        System.out.println(mihabitacion.getDescripcion() + "Costo de Chocolate " + mihabitacion.costo());

        mihabitacion = new VinoDecorator(mihabitacion);
        System.out.println(mihabitacion.getDescripcion() + "Costo de vino " + mihabitacion.costo());
    }


}
