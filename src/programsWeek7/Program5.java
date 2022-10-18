package programsWeek7;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic;
        String name;
        System.out.println(" Enter the name of employee");
        //n=sc.nextLine();
        name=sc.nextLine();
        System.out.println(" enter the basic salary");
        basic = sc.nextInt();
        double da=basic*30/100;
        double hra = basic*12.5/100;
        double pf = basic*10/100;
        double gp = basic+da+hra;
        double np = gp-pf;
        System.out.println("employee name = "+name);
        System.out.println("gross pay = "+np);
        System.out.println("net " +np);





    }

}
