package ifelseloop;

import java.util.Scanner;

/*Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is not tax below 2.5L. Take the input amount as input from the user.*/
public class TAX {
    public static void main(String[] args) {
//        float income;
//        double tax; //double jyada size consume karta isiliye isko kam use jkarte hai
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Income(in Lacs)");
//        income=sc.nextFloat();
//        tax=0;
//        if(income<2.5){
//            tax=0;
//        }
//        else if(income>=2.5 && income<5.0){
//            tax=tax+0.05*(income-2.5);
//
//        }
//        else if(income>=5 && income<10){
//            tax=tax+0.05*(5-2.5);
//            tax=tax+0.20*(income-5);
//        }
//        else{
//            tax=tax+0.05*(5-2.5);
//            tax=tax+0.20*(10-5);
//            tax=tax+0.30*(income-10);
//        }
//
//        System.out.println("THE TAX SHOULD BE PAID IS "+tax+" lacs");
//    }
        float income;//jab memory limited to use float
        float tax; //double jyada size consume karta isiliye isko kam use karte hai
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Income(in Lacs)");
        income=sc.nextFloat();
        tax=0;
        if(income<2.5f){
            tax=0;
        }
        else if(income>=2.5f && income<5.0f){
            tax=tax+0.05f*(income-2.5f);

        }
        else if(income>=5f && income<10f){
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.20f*(income-5f);
        }
        else{
            tax=tax+0.05f*(5f-2.5f);
            tax=tax+0.20f*(10f-5f);
            tax=tax+0.30f*(income-10f);
        }

        System.out.println("THE TAX SHOULD BE PAID IS "+tax+" lacs");
    }
}
