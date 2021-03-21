package pl.camp.it.car.rent.gui;

import pl.camp.it.car.rent.model.Bus;
import pl.camp.it.car.rent.model.Car;
import pl.camp.it.car.rent.model.Motorcycle;

public class GUI {
    public void showMainMenu() {
        System.out.println("1. Lista pojazdów");
        System.out.println("2. Wypożycz pojazd");
        System.out.println("3. Oddaj pojazd");
        System.out.println("4. Wyjdź");
    }

    public void showAllCars(Car[] cars) {
        for(Car car : cars) {
            StringBuilder sb = new StringBuilder();
            sb.append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" rok produkcji: ")
                    .append(car.getYear())
                    .append(" przebieg: ")
                    .append(car.getMileage())
                    .append(" cena: ")
                    .append(car.getPrice())
                    .append(" rejestracja: ")
                    .append(car.getPlate())
                    .append(" dostępny: ")
                    .append(car.isRent() ? "Nie" : "Tak");

            System.out.println(sb.toString());
        }
    }

    public void showAllBuses(Bus[] buses) {
        for(Bus bus : buses) {
            StringBuilder sb = new StringBuilder();
            sb.append(bus.getBrand())
                    .append(" ")
                    .append(bus.getModel())
                    .append(" rok produkcji: ")
                    .append(bus.getYear())
                    .append(" przebieg: ")
                    .append(bus.getMileage())
                    .append(" cena: ")
                    .append(bus.getPrice())
                    .append(" rejestracja: ")
                    .append(bus.getPlate())
                    .append(" ilość miejsc: ")
                    .append(bus.getSeats())
                    .append(" niskopodłogowy: ")
                    .append(bus.isLowRider() ? "Tak" : "Nie")
                    .append(" dostępny: ")
                    .append(bus.isRent() ? "Nie" : "Tak");

            System.out.println(sb.toString());
        }
    }

    public void showAllMotorcycles(Motorcycle[] motorcycles) {
        for(Motorcycle motorcycle : motorcycles) {
            StringBuilder sb = new StringBuilder();
            sb.append(motorcycle.getBrand())
                    .append(" ")
                    .append(motorcycle.getModel())
                    .append(" rok produkcji: ")
                    .append(motorcycle.getYear())
                    .append(" przebieg: ")
                    .append(motorcycle.getMileage())
                    .append(" cena: ")
                    .append(motorcycle.getPrice())
                    .append(" rejestracja: ")
                    .append(motorcycle.getPlate())
                    .append(" dostawka: ")
                    .append(motorcycle.isExtraSeat() ? "Tak" : "Nie")
                    .append(" typ: ")
                    .append(motorcycle.getType())
                    .append(" dostępny: ")
                    .append(motorcycle.isRent() ? "Nie" : "Tak");

            System.out.println(sb.toString());
        }
    }
}
