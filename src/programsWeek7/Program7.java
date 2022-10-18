package programsWeek7;
//Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
// Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales ID");
        int salesID = sc.nextInt();
        System.out.println("Enter seller's name");
        String sellername = sc.nextLine();
        System.out.println("Enter sales amount:");
        double salesamount = sc.nextDouble();
        System.out.println("Enter Basic Salary");
        double basicsalary = sc.nextDouble();
        System.out.println("Enter sales Commision");
        double salescommission,commission;
        if(salesamount >=50000) {
            commission = salesamount*35/100;
            System.out.println("Commission is 35% on more than 50,000 sales amount:"+commission);
        } else if (salesamount >=30000){
            commission=salesamount*20/100;
            System.out.println("Commission is 20% on more than 30,000 sales amount:"+commission);
        }else if (salesamount>=20000){
            commission=salesamount*10/100;
            System.out.println("Commission is 10% on more than 20,000 sales amount:"+commission);
        }else if (salesamount>=10000) {
            commission = salesamount * 5 / 100;
            System.out.println("Commission is 5% on more than 10,000 sales amount:" + commission);
        }else if (salesamount<10000) {
            commission = salesamount * 2 / 100;
            System.out.println("Commission is 2% on less than 10,000 sales amount:" + commission);
        }

    }
    }
