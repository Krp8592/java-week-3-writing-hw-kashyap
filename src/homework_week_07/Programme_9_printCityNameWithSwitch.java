package homework_week_07;

import java.util.Scanner;

/**
 * Input any alphabet from "A to F" and print their city name accordingly (use if else); if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT.
 */

public class Programme_9_printCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A and F : ");
        String city = scanner.next().toUpperCase();
        Programme_9_printCityNameWithSwitch cityName = new Programme_9_printCityNameWithSwitch();
        cityName.printCityName(city);
        //Closing the scanner object
        scanner.close();

    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
            case "E":
                System.out.println("Edinburgh");
            case "F":
                System.out.println("Feltham");
            default:
                System.out.println("The alphabet you entered if not between A and F");
        }

    }
}
