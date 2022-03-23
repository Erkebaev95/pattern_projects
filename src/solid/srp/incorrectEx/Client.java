package solid.srp.incorrectEx;

public class Client {
    public static void main(String[] args) {
        IPhone phone = new Phone();
        phone.dial("012354");
        phone.send("message");
        phone.receive();
        phone.disconnect();
    }
}
