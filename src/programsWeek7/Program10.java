package programsWeek7;
//.Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));//
    }

}

