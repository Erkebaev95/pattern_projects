package builder.ex1;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setEngine();
        builder.setSeats(4);
    }
}
