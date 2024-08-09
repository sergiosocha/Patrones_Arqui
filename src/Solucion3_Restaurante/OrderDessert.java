public class OrderDessert extends  Order{

    @Override
    void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad de comida");
    }


    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de comida");
    }
}
