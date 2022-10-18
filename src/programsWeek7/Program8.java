package programsWeek7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter aplphabet A to F");
        char in = sc.next().charAt(0);
        if (in == 'A'){ ;
         System.out.println("Ahmedabad");
    } else if(in =='B'){
            System.out.println("Bombay");
        } else if(in =='C'){
            System.out.println("Culcutta");
        } else if(in =='D'){
            System.out.println("Dehradun");
        } else if(in =='E'){
            System.out.println("Ealing");
        } else if(in =='F'){
            System.out.println("Feltham");
        } else
        System.out.println("Invalid Entry");


    }
}
