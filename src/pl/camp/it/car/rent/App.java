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
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny auta:");
                    if(database.rentCar(reader.readLine())) {
                        System.out.println("Wypożyczono !!");
                    } else {
                        System.out.println("Nie znaleziono auta lub auto jest już wypożyczone !!");
                    }
                    break;
                case "3":
                    System.out.println("Podaj numer rejestracyjny auta:");
                    if(database.returnCar(reader.readLine())) {
                        System.out.println("Oddano !!");
                    } else {
                        System.out.println("Nie znaleziono auta lub auto jest nie jest wypożyczone !!");
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
