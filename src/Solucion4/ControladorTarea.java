import java.util.ArrayList;
import java.util.List;

public class ControladorTarea {
    private List<Command> commandHistorial = new ArrayList<>();

    public void ejecutarCommand(Command command){
        command.ejecutar();
        commandHistorial.add(command);
    }

}
