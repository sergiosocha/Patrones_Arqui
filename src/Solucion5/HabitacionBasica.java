public class HabitacionBasica implements  Habitacion{

    @Override
    public String getDescripcion() {
        return "Habitacion Basica del Hotel";
    }

    @Override
    public double costo() {
        return 10;
    }
}
