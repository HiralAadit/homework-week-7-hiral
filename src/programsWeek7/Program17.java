package programsWeek7;
/*Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;
public class Program17 {
    public static void main(String[] args) {
int[] arraydeta1={23,45,6,56,77,89,90,65,45};
String[] arraydeta2={"jone","amos,", "enoch","akeem","book","car"};
System.out.println("Original value: "+Arrays.toString(arraydeta1));

Arrays.sort(arraydeta1);
        System.out.println("Sorted Value :"+ Arrays.toString(arraydeta1));
System.out.println("Original Value : "+ Arrays.toString(arraydeta2));
Arrays.sort(arraydeta2);
        System.out.println("Sorted Value :"+ Arrays.toString(arraydeta2));



    }
}
