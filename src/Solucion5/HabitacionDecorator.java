public abstract class HabitacionDecorator implements Habitacion{

    private Habitacion habitacion;


    public HabitacionDecorator(Habitacion habitacion){
        this.habitacion = habitacion;
    }

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double costo();
}
