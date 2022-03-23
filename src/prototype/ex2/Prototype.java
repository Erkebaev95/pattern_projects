package prototype.ex2;

public abstract class Prototype {
     int x;
     int y;
     String color;

    public Prototype() {
    }

    public Prototype(int x, int y, String color) {
        this();
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract Prototype clone();
}
