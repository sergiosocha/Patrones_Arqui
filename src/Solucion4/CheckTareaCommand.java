public class CheckTareaCommand implements Command{

    Tarea tarea;
    private boolean check = false;

    public CheckTareaCommand(Tarea tarea){
        this.tarea = tarea;
        this.check = tarea.check;
    }
    @Override
    public void ejecutar() {
        System.out.println("Tarea realizada");
    }
}
