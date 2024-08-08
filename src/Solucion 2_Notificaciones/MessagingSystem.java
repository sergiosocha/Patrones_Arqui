import java.util.ArrayList;
import java.util.List;

public class MessagingSystem {

    private List<Observer> observers;

    public MessagingSystem(){
        this.observers = new ArrayList<>();
    }

    public void addDevice(Observer observer){
        this.observers.add(observer);
    }

    public void removeDevice(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyDevice(String message){
        for (Observer observer : this.observers) {
            observer.update(message);
        }
    }

    public void setEstado(String message) {
        System.out.println("Mensaje recibido: " + message);
        notifyDevice(message);
    }
}