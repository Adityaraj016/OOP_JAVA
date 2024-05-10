package Recursion;
import java.util.*;
//Write a Java method to print the multiplication table of a number n.

public class table {

    static void Multiplication(int n){
        int i=0;
        for(i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want table");
        int n=sc.nextInt();
        Multiplication(n);
    }

}
