public class OrderFood extends  Order{

    @Override
    void verificarDisponibilidad() {
        System.out.println("Calculando precio de comida");
    }



    @Override
    void calcularPrecio() {
        System.out.println("Calculando precio de comida");
    }
}
