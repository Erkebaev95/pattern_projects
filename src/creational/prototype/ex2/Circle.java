package creational.prototype.ex2;

public class Circle extends Prototype {
     int radius;

    public Circle() {
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);
    }
}
