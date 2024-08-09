public class EditTareaCommand implements Command {

    private Tarea tareaVieja;
    private Tarea tareaNueva;
    private ControladorTarea controladorTarea;

    public EditTareaCommand(Tarea tareaVieja, Tarea tareaNueva, ControladorTarea controladorTarea){

        this.tareaVieja = tareaVieja;
        this.tareaNueva = tareaNueva;
        this.controladorTarea = controladorTarea;

    }

    @Override
    public void ejecutar() {

        controladorTarea.actualizarTarea(tareaNueva, tareaVieja);
    }

    @Override
    public void deshacer() {
        ControladorTarea.actualizarTarea(tareaNueva, tareaVieja);

    }
}
