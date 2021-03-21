package pl.camp.it.car.rent.model;

public class Bus extends Vehicle {
    private int seats;
    private boolean lowRider;

    public Bus(String brand, String model, int mileage, int year, double price, String plate, int seats, boolean lowRider) {
        super(brand, model, mileage, year, price, plate);
        this.seats = seats;
        this.lowRider = lowRider;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isLowRider() {
        return lowRider;
    }
}
