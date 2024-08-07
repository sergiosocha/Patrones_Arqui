public abstract class Order {

    public void procesarOrden(){
        tomaDePedido();
        verificarDisponibilidad();
        prepararPedido();
        calcularPrecio();
    }


    public void tomaDePedido(){
    }

    abstract void verificarDisponibilidad();

    public void prepararPedido(){

    };

    abstract void calcularPrecio();




}
