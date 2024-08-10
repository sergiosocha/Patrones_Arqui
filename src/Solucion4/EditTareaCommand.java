public class EditTareaCommand implements Command{

    private Tarea tarea;
    private String tareaModificada;

    public EditTareaCommand(Tarea tarea, String tareaModificada){
        this.tarea = tarea;
        this.tareaModificada = tareaModificada;
    }
    @Override
    public void ejecutar() {
        System.out.println("Tarea modificada");
    }
}
