package solid.srp.coorectEx;

public class PClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());
        phone.dial("01335");
        phone.send("message");
        phone.receive();
        phone.disconnect();
    }
}
