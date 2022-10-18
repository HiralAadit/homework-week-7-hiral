package programsWeek7;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

 */

import kotlin.Result;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        String name,grade,pass,fail;
        int english, maths, science, roll_No;
        double Percentage;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Name");
        String n = in.nextLine();
        System.out.println("Enter Roll_No");
        int rn = in.nextInt();
        System.out.println("Enter Maths Marks");
        int m = in.nextInt();
        System.out.println("Enter Science Marks");
        int s = in.nextInt();
        System.out.println("Enter English Marks");
        int e = in.nextInt();
        int Total =  m+s+e; // total of 3 sub.
        //System.out.println("Enter Percentage");
        //double per = in.nextDouble();
        Percentage = (Total /300.0)*100;


       // int Result = in.nextInt();


        if (Percentage >=100)
           grade = ("Invalid number");
        if (Percentage >= 80)
            grade = "A+";
        if (Percentage >= 60 && Percentage <80)
            grade = "A";
        if (Percentage >=50 && Percentage <60)
            grade = "B";
        if (Percentage >=35 && Percentage <50)
            grade = "C";
        if (Percentage <= 35)






        System.out.println("Name :    "+ n);
        System.out.println("RollNo :    "+ rn);
        System.out.println("Maths :    "+m);
        System.out.println("Science :    "+s);
        System.out.println("English :    "+e);
        System.out.println("Total Marks:  "+Total);
        System.out.println("Percentage:  "+Percentage);
        System.out.println("Grade="     );

        System.out.println("______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("|     Name: " + " "+"    "+n+"|");
        System.out.println("|     Roll No: "+""+" " +rn+" |");
        System.out.println("|_____________________________|");
        System.out.println("        Subject    :   Marks  |");
        System.out.println("|_____________________________|");
        System.out.println("       Maths  : "+" "+"  "+m+"|");
        System.out.println("       Science: "+" "+"  "+s+"|");
        System.out.println("       English: "+" "+"  "+e+"|");
        System.out.println("|_____________________________|");
        System.out.println("|      Total   : "+" "+Total+"|");
        System.out.println("|_____________________________|");
        System.out.println("|Percentage "+" "+Percentage+"|");
        System.out.println("Result       :  ");
        //System.out.println("    Grade   : "+" "+" " +grade+"|");
                }



    }


