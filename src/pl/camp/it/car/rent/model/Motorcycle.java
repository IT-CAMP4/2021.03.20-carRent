package pl.camp.it.car.rent.model;

public class Motorcycle {
    private String brand;
    private String model;
    private int mileage;
    private int year;
    private double price;
    private String plate;
    private boolean rent;
    private boolean extraSeat;
    private String type;

    public Motorcycle(String brand, String model, int mileage,
                      int year, double price, String plate,
                      boolean extraSeat, String type) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
        this.plate = plate;
        this.rent = false;
        this.extraSeat = extraSeat;
        this.type = type;
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

    public boolean isExtraSeat() {
        return extraSeat;
    }

    public String getType() {
        return type;
    }
}
