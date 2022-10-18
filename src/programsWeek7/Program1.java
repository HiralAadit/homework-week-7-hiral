package programsWeek7;
//Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter even number ");
        System.out.println("Enter odd number");
        int number=input.nextInt();

        String result = number% 2 == 0? "Even":"odd";
            System.out.println(number + "is " +result);

            }



    }




