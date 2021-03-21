package pl.camp.it.car.rent;

import pl.camp.it.car.rent.database.Database;
import pl.camp.it.car.rent.gui.GUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        Database database = new Database();
        GUI gui = new GUI();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while(flag) {
            gui.showMainMenu();
            switch (reader.readLine()) {
                case "1":
                    gui.showAllCars(database.getCars());
                    gui.showAllBuses(database.getBuses());
                    gui.showAllMotorcycles(database.getMotorcycles());
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny pojazd:");
                    if(database.rentVehicle(reader.readLine())) {
                        System.out.println("Wypożyczono !!");
                    } else {
                        System.out.println("Nie znaleziono pojazdu lub pojazd jest już wypożyczony !!");
                    }
                    break;
                case "3":
                    System.out.println("Podaj numer rejestracyjny pojazdu:");
                    if(database.returnVehicle(reader.readLine())) {
                        System.out.println("Oddano !!");
                    } else {
                        System.out.println("Nie znaleziono pojazdu lub pojazd nie jest wypożyczony !!");
                    }
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Wybór nieprawidłowy !!");
            }
        }
    }
}
