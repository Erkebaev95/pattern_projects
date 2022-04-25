package creational.singleton.ex2;

public class Singleton {
    int i = 0;
    private final static Singleton INSTANCE = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.i = 5;
        System.out.println(singleton2.i);
    }
}
