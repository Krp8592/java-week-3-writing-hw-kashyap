package homework_week_07;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that input is odd or even ?
 * Hint : Use ternary operator(? :)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);

        scanner.close();
    }

    //Checking the number is odd or even
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOdd + " number");
    }
}
