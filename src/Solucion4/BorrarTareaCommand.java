import java.util.List;

public class BorrarTareaCommand implements Command{
    private Tarea tarea;
    private List<Tarea> listaTareas;

    public BorrarTareaCommand(Tarea tarea, List<Tarea> listaTareas) {
        this.tarea = tarea;
        this.listaTareas = listaTareas;
    }
    @Override
    public void ejecutar() {
        listaTareas.remove(tarea);
        System.out.println("La tarea fue eliminada");
    }
}
