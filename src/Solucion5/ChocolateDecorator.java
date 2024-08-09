public class ChocolateDecorator extends HabitacionDecorator{

    public ChocolateDecorator(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String getDescripcion() {
        return "Incluir Chocolate Gourmet en la habitación";
    }

    @Override
    public double costo() {
        return 100 ;
    }
}
