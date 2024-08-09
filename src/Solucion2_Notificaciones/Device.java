public class Device implements Observer{

    private String deviceName;

    public Device(String deviceName) {
        this.deviceName = deviceName;
    }

    public void update(String message){
        System.out.println(deviceName + " recibió el mensaje: " + message);
    }
}
