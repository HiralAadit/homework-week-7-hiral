package programsWeek7;

import java.util.Scanner;

public class Program9 {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry with switch statement

    public static void main(String[] args) {
        String city;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character from A to F");
        city = sc.nextLine();

        switch (city){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Chicago");
                break;
            case "D":
                System.out.println("Denmark");
                break;
            case "E":
                System.out.println("Ealing");
                break;
            case "F":
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }


    }


