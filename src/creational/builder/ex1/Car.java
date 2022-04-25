package creational.builder.ex1;

public class Car {
    private String typeOfEngine;
    private String quantityOfSeat;
    private String typeOfCar;

    @Override
    public String toString() {
        return "Car{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", quantityOfSeat='" + quantityOfSeat + '\'' +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void setQuantityOfSeat(String quantityOfSeat) {
        this.quantityOfSeat = quantityOfSeat;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }
}
