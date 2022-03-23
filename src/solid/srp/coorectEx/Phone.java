package solid.srp.coorectEx;

public class Phone implements IConnection, IDataManager {
    private IConnection connection;
    private IDataManager dataChannel;

    public Phone(IConnection connection, IDataManager dataChannel) {
        this.connection = connection;
        this.dataChannel = dataChannel;
    }

    @Override
    public void dial(String number) {
        connection.dial(number);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataChannel.send(message);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
