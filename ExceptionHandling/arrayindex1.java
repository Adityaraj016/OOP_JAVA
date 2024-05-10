package ExceptionHandling;

import java.util.Scanner;

public class arrayindex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []marks={50,70,90,95,100};
        boolean flag=true;
        while(flag){
            System.out.println("Enter the index number");
            int m= sc.nextInt();
            try{
                System.out.println("The element at index "+m+" is:"+marks[m]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Arithmetic Exception Occurred");
                System.out.println(e);
                flag=false;
            }
        }
    }
}
