public class FlowerDecorator extends HabitacionDecorator{

    public FlowerDecorator(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String getDescripcion() {
        return "Incluyendo  Flores en la habitacion";
    }

    @Override
    public double costo() {
        return 200;
    }


}
