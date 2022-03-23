package solid.srp.coorectEx;

public interface IDataManager {
    // Этот интерфейс отвечает за отправку и получение
    void send(String message);
    int receive();
}
