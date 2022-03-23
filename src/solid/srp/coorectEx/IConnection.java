package solid.srp.coorectEx;

public interface IConnection {
    // Этот интерфейс отвечает за соединение и отключение
    void dial(String number);
    void disconnect();
}
