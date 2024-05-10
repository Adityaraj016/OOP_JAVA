package ifelseloop;
import java.util.Scanner;
//Write a program to sum first n even numbers using a while loop.
//Write a program to print the multiplication table of a given number n.
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of first even numbers you want sum");
        n=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+2*i;
        }
        System.out.println(sum);


    }
}
