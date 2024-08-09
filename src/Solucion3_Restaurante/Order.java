public abstract class Order {

    public void procesarOrden(){
        tomaDePedido();
        verificarDisponibilidad();
        prepararPedido();
        calcularPrecio();
    }


    public void tomaDePedido(){

        System.out.println("Tomando orden");
    }

    public void prepararPedido(){
        System.out.println("Preparando el pedido");

    }

    abstract void verificarDisponibilidad();


    abstract void calcularPrecio();




}
