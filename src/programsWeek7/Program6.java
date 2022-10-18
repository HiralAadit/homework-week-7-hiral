package programsWeek7;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
// use moduler operater %
public class Program6 {
    public static void main(String[] args) {
        int number, remainder;
        System.out.println("please enter an Integer Number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        remainder = number % 2;

        if( remainder == 0)
            System.out.println(number +  " is Even Number");
        else
            System.out.println(number +  " is Odd Number");

    }
}
