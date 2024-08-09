public class CrearTareaCommand implements Command {
    private Tarea tarea;

    public CrearTareaCommand(Tarea tarea){
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {

    }
}
