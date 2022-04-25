package creational.builder.ex1;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int number) {
        System.out.println("Количество сидений - " + number);
    }

    @Override
    public void setEngine() {
        System.out.println("Электро двигатель");
    }
}
