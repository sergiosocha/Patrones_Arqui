public abstract class Order {

    public void procesarOrden(){
        tomaDePedido();
        verificarDisponibilidad();
        prepararPedido();
        calcularPrecio();
    }


    public void tomaDePedido(){
    }

    public void prepararPedido(){

    };

    abstract void verificarDisponibilidad();


    abstract void calcularPrecio();




}
