package pl.camp.it.car.rent.gui;

import pl.camp.it.car.rent.model.Car;

public class GUI {
    public void showMainMenu() {
        System.out.println("1. Lista aut");
        System.out.println("2. Wypożycz auto");
        System.out.println("3. Oddaj auto");
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
}
