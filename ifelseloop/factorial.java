package ifelseloop;
import java.util.Scanner;
//Write a program to find the factorial of a given number using for loops.
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number you want factorial"+"\n");
        n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
