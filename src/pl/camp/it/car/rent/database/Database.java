package pl.camp.it.car.rent.database;

import pl.camp.it.car.rent.model.Bus;
import pl.camp.it.car.rent.model.Car;

public class Database {
    private Car[] cars = new Car[5];
    private Bus[] buses = new Bus[2];

    public Database() {
        this.cars[0] = new Car("BMW", "5", 200000, 2010, 300.0, "KR11");
        this.cars[1] = new Car("Audi", "A6", 150000, 2012, 400.0, "KR22");
        this.cars[2] = new Car("Toyota", "Corolla", 70000, 2019, 350.0, "KR33");
        this.cars[3] = new Car("Mercedes", "E", 200000, 2009, 320.0, "KR44");
        this.cars[4] = new Car("Honda", "Civic", 40000, 2016, 360.99, "KR55");

        buses[0] = new Bus("Solaris", "5000", 500000, 2007, 600.0, "KR666", 50, true);
        buses[1] = new Bus("Solaris", "2000", 700000, 2002, 500.0, "KR777", 40, false);
    }

    public Car[] getCars() {
        return this.cars;
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && car.isRent()) {
                car.setRent(false);
                return true;
            }
        }
        return false;
    }
}
