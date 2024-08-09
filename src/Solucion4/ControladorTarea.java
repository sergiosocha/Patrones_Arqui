import java.util.ArrayList;
import java.util.List;

public class ControladorTarea {
    private static List<Tarea> tareas = new ArrayList<>();

    public void addTarea(Tarea tarea){
        tareas.add(tarea);
        System.out.println("Tarea agregada");
    }

    public void borrarTarea(Tarea tarea){
        System.out.println("Borrando tarea...");
    }

    public void actualizarTarea(Tarea tareaNueva, Tarea tareaVieja){
        System.out.println("Actializando tarea...");
    }

    public void CheckTarea(){
        System.out.println("Tarea finalizada...");
    }
}
