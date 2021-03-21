package pl.camp.it.car.rent.gui;

import pl.camp.it.car.rent.model.Bus;
import pl.camp.it.car.rent.model.Motorcycle;
import pl.camp.it.car.rent.model.Vehicle;

public class GUI {
    public void showMainMenu() {
        System.out.println("1. Lista pojazdów");
        System.out.println("2. Wypożycz pojazd");
        System.out.println("3. Oddaj pojazd");
        System.out.println("4. Wyjdź");
    }

    public void showAllVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            StringBuilder sb = new StringBuilder();
            sb.append(vehicle.getBrand())
                    .append(" ")
                    .append(vehicle.getModel())
                    .append(" rok produkcji: ")
                    .append(vehicle.getYear())
                    .append(" przebieg: ")
                    .append(vehicle.getMileage())
                    .append(" cena: ")
                    .append(vehicle.getPrice())
                    .append(" rejestracja: ")
                    .append(vehicle.getPlate());

            if(vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                sb.append(" ilość miejsc: ")
                        .append(bus.getSeats())
                        .append(" niskopodłogowy: ")
                        .append(bus.isLowRider() ? "Tak" : "Nie");
            }

            if(vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                sb.append(" dostawka: ")
                        .append(motorcycle.isExtraSeat() ? "Tak" : "Nie")
                        .append(" typ: ")
                        .append(motorcycle.getType());
            }

            sb.append(" dostępny: ")
                    .append(vehicle.isRent() ? "Nie" : "Tak");


            System.out.println(sb.toString());
        }
    }

    public void showRentResult(boolean rentResult) {
        if(rentResult) {
            System.out.println("Wypożyczono !!");
        } else {
            System.out.println("Nie znaleziono pojazdu lub pojazd jest już wypożyczony !!");
        }
    }

    public void showReturnResult(boolean returnResult) {
        if(returnResult) {
            System.out.println("Oddano !!");
        } else {
            System.out.println("Nie znaleziono pojazdu lub pojazd nie jest wypożyczony !!");
        }
    }
}
