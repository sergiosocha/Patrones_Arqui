import java.util.List;

public class CrearTareaCommand implements Command {
    private Tarea tarea;
    private List<Tarea> listaTareas;

    public CrearTareaCommand(Tarea tarea, List<Tarea> listaTareas) {
        this.tarea = tarea;
        this.listaTareas = listaTareas;
    }

    @Override
    public void ejecutar() {
        listaTareas.add(tarea);
        System.out.println("Tarea agregada");
    }
}



