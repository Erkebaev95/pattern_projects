package solid.srp.incorrectEx;

public interface IPhone {
    // connection management
    void dial(String number);
    void disconnect();

    // data management
    void send(String message);
    int receive();
}
