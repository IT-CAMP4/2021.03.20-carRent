package pl.camp.it.car.rent;

import pl.camp.it.car.rent.database.Database;
import pl.camp.it.car.rent.gui.GUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        Database database = new Database();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loginCounter = 0;
        while(true) {
            System.out.println("Podaj login:");
            String login = reader.readLine();
            System.out.println("Podaj haslo:");
            String password = reader.readLine();

            boolean authResult = database.authenticate(login, password);
            if(authResult) {
                break;
            } else {
                System.out.println("Niepoprawne dane !!");
                loginCounter++;
            }

            if(loginCounter >= 3) {
                System.out.println("Logowanie nieudane !!");
                System.exit(0);
            }
        }

        boolean flag = true;
        while(flag) {
            GUI.showMainMenu();
            switch (reader.readLine()) {
                case "1":
                    GUI.showAllVehicles(database.getVehicles());
                    break;
                case "2":
                    System.out.println("Podaj numer rejestracyjny pojazd:");
                    GUI.showRentResult(database.rentVehicle(reader.readLine()));
                    break;
                case "3":
                    System.out.println("Podaj numer rejestracyjny pojazdu:");
                    GUI.showReturnResult(database.returnVehicle(reader.readLine()));
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
