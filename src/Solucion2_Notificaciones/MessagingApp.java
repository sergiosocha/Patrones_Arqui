public class MessagingApp {
    public static void main(String[] args) {

        MessagingSystem messagingSystem = new MessagingSystem();

        Device phone1 = new Device("Phone1");
        Device pc1 = new Device("Pc1");

        messagingSystem.addDevice(phone1);
        messagingSystem.addDevice(pc1);

        messagingSystem.receiveMessage("Nuevo mensaje");
    }
}
