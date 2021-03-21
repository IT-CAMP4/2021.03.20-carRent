package pl.camp.it.car.rent.model;

public class Motorcycle extends Vehicle {
    private boolean extraSeat;
    private String type;

    public Motorcycle(String brand, String model, int mileage,
                      int year, double price, String plate,
                      boolean extraSeat, String type) {
        super(brand, model, mileage, year, price, plate);
        this.extraSeat = extraSeat;
        this.type = type;
    }

    public boolean isExtraSeat() {
        return extraSeat;
    }

    public String getType() {
        return type;
    }
}
