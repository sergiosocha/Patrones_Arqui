import java.util.ArrayList;

public class Invoker {
    private ArrayList<Command> commandHistorial = new ArrayList<>();

    private void ejecutarCommand(Command command){
        command.ejecutar();
        commandHistorial.add(command);

    }

}
