package programsWeek7;
/*. Write a Java program to sum values of an array.

 */

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

        int a[]=new int[5];
        int sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Elements in Array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
            }
        System.out.println("Array Elements ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"");
            sum=a[i]+sum;
        }
        System.out.println("\nAddition of Array Elements"+sum);

    }
}
