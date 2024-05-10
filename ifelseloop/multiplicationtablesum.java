package ifelseloop;

import java.util.Scanner;

//Write a program to calculate the sum of the numbers occurring in the multiplication table of n.
public class multiplicationtablesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number you want sum of table");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+n*i;
        }
        System.out.println("the sum is "+sum);
    }
}
