package pl.camp.it.car.rent.database;

import pl.camp.it.car.rent.model.Bus;
import pl.camp.it.car.rent.model.Car;
import pl.camp.it.car.rent.model.Motorcycle;

public class Database {
    private Car[] cars = new Car[5];
    private Bus[] buses = new Bus[2];
    private Motorcycle[] motorcycles = new Motorcycle[3];

    public Database() {
        this.cars[0] = new Car("BMW", "5", 200000, 2010, 300.0, "KR11");
        this.cars[1] = new Car("Audi", "A6", 150000, 2012, 400.0, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 70000, 2019, 350.0, "KR33");
        this.cars[3] = new Car("Mercedes", "E", 200000, 2009, 320.0, "KR44");
        this.cars[4] = new Car("Honda", "Civic", 40000, 2016, 360.99, "KR55");

        this.buses[0] = new Bus("Solaris", "5000", 500000, 2007, 600.0, "KR666", 50, true);
        this.buses[1] = new Bus("Solaris", "2000", 700000, 2002, 500.0, "KR777", 40, false);

        this.motorcycles[0] = new Motorcycle("BMW", "500", 30000, 2010, 300.0, "KR1111", false, "Ścigacz");
        this.motorcycles[1] = new Motorcycle("Harley Davidson", "Night Rod", 30000, 2014, 400.0, "KR2222", false, "Chopper");
        this.motorcycles[2] = new Motorcycle("Honda", "CB1000R", 10000, 2016, 450.0, "KR3333", false, "Street");
    }

    public Car[] getCars() {
        return this.cars;
    }

    public Bus[] getBuses() {
        return this.buses;
    }

    public Motorcycle[] getMotorcycles() {
        return motorcycles;
    }

    public boolean rentVehicle(String plate) {
        Car car = findCar(plate);
        if(car != null && !car.isRent()) {
            car.setRent(true);
            return true;
        }
        Bus bus = findBus(plate);
        if(bus != null && !bus.isRent()) {
            bus.setRent(true);
            return true;
        }
        Motorcycle motorcycle = findMotorcycle(plate);
        if(motorcycle != null && !motorcycle.isRent()) {
            motorcycle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String plate) {
        Car car = findCar(plate);
        if(car != null && car.isRent()) {
            car.setRent(false);
            return true;
        }
        Bus bus = findBus(plate);
        if(bus != null && bus.isRent()) {
            bus.setRent(false);
            return true;
        }
        Motorcycle motorcycle = findMotorcycle(plate);
        if(motorcycle != null && motorcycle.isRent()) {
            motorcycle.setRent(false);
            return true;
        }
        return false;
    }

    private Car findCar(String plate) {
        for (Car car : this.cars) {
            if (car.getPlate().equals(plate)) {
                return car;
            }
        }
        return null;
    }

    private Bus findBus(String plate) {
        for (Bus bus : this.buses) {
            if (bus.getPlate().equals(plate)) {
                return bus;
            }
        }
        return null;
    }

    private Motorcycle findMotorcycle(String plate) {
        for (Motorcycle motorcycle : this.motorcycles) {
            if (motorcycle.getPlate().equals(plate)) {
                return motorcycle;
            }
        }
        return null;
    }
}
