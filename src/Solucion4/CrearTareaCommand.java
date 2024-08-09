public class CrearTareaCommand implements Command {
    private Tarea tarea;
    private ControladorTarea controladorTarea;

    public CrearTareaCommand(Tarea tarea, ControladorTarea controladorTarea){
        this.tarea = tarea;
        this.controladorTarea = controladorTarea;
    }

    @Override
    public void ejecutar() {
        ControladorTarea.addTarea(tarea);
    }

    public void deshacer(){
        ControladorTarea.borrarTarea(tarea);
    }
}


