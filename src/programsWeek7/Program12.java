package programsWeek7;

import java.util.Scanner;

public class Program12 {
    //Write a program that tells us input value is number or an alphabet or symbol.

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character: ");
        ch=m.next().charAt(0);
        System.out.println(ch>='a'&&ch<='z'?"Small case alphabet"
                :ch>='A'&&ch<='Z'?"Capital case aplphabet"
                :ch>='0'&&ch<='9'?"Digit"
                :"Symbol");

    }
}
