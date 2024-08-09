public class OrderBeverage extends  Order{


    @Override
    void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de la bebida");
    }


    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de la bebida");
    }
}
