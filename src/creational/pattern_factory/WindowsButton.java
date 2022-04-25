package creational.pattern_factory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows");
    }

    @Override
    public void onClick(String s) {
        System.out.println("");
    }
}
