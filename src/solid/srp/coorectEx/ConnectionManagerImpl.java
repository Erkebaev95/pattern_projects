package solid.srp.coorectEx;

public class ConnectionManagerImpl implements IConnection {
    @Override
    public void dial(String number) {
        System.out.println("connection established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }
}
