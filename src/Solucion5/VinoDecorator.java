public class VinoDecorator extends HabitacionDecorator{

    public VinoDecorator(Habitacion habitacion) {
        super(habitacion);
    }

    @Override
    public String getDescripcion() {
        return "Desea incluir vino de lujo";
    }

    @Override
    public double costo() {
        return  200;
    }
}
