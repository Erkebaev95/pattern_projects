package creational.prototype.ex2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private static List<Prototype> prototypes = new ArrayList<>();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;
        prototypes.add(circle);

        Circle another = (Circle) circle.clone();
        prototypes.add(another);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        prototypes.add(rectangle);
    }
}
