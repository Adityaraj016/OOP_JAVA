package Recursion;
import java.util.*;
public class fibonacci {
//Write a function to print the nth term of the Fibonacci series using recursion.
    static int fibonacci1(int n){
        if(n<=1){
            return n;
        }
        else{
            return (fibonacci1(n-1) + fibonacci1(n-2));
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci1(i)+" ");
        }

    }
}
