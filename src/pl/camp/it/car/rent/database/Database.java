package pl.camp.it.car.rent.database;

import pl.camp.it.car.rent.model.Bus;
import pl.camp.it.car.rent.model.Car;
import pl.camp.it.car.rent.model.Motorcycle;
import pl.camp.it.car.rent.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Vehicle> vehicles = new ArrayList<>();

    public Database() {
        this.vehicles.add(new Car("BMW", "5", 200000, 2010, 300.0, "KR11"));
        this.vehicles.add(new Car("Audi", "A6", 150000, 2012, 400.0, "KR22"));
        this.vehicles.add(new Car("Toyota", "Corolla", 70000, 2019, 350.0, "KR33"));
        this.vehicles.add(new Car("Mercedes", "E", 200000, 2009, 320.0, "KR44"));
        this.vehicles.add(new Car("Honda", "Civic", 40000, 2016, 360.99, "KR55"));

        this.vehicles.add(new Bus("Solaris", "5000", 500000, 2007, 600.0, "KR666", 50, true));
        this.vehicles.add(new Bus("Solaris", "2000", 700000, 2002, 500.0, "KR777", 40, false));

        this.vehicles.add(new Motorcycle("BMW", "500", 30000, 2010, 300.0, "KR1111", false, "Ścigacz"));
        this.vehicles.add(new Motorcycle("Harley Davidson", "Night Rod", 30000, 2014, 400.0, "KR2222", false, "Chopper"));
        this.vehicles.add(new Motorcycle("Honda", "CB1000R", 10000, 2016, 450.0, "KR3333", false, "Street"));
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean rentVehicle(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if(vehicle != null && !vehicle.isRent()) {
            vehicle.setRent(true);
            return true;
        }
        return false;
    }

    public boolean returnVehicle(String plate) {
        Vehicle vehicle = findVehicle(plate);
        if(vehicle != null && vehicle.isRent()) {
            vehicle.setRent(false);
            return true;
        }
        return false;
    }

    private Vehicle findVehicle(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if (vehicle.getPlate().equals(plate)) {
                return vehicle;
            }
        }
        return null;
    }
}
