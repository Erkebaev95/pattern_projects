package creational.prototype.ex2;

public class Rectangle extends Prototype {
     int width;
     int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this.width, this.height);
    }
}
