package pl.camp.it.car.rent.model;

public class Bus {
    private String brand;
    private String model;
    private int mileage;
    private int year;
    private double price;
    private String plate;
    private boolean rent;
    int seats;
    boolean lowRider;

    public Bus(String brand,
               String model,
               int mileage,
               int year,
               double price,
               String plate,
               int seats,
               boolean lowRider) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
        this.plate = plate;
        this.rent = false;
        this.seats = seats;
        this.lowRider = lowRider;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isLowRider() {
        return lowRider;
    }
}
