package ExceptionHandling;

import java.util.Scanner;

//write a program that allows you to keep accessing
//an array unyil a valid index is given.if max retries
//exceed 5 print error
public class ques3 {
    public static void main(String[] args) {
        int []marks={50,60,70,80,90,100,95,80};
        Scanner sc=new Scanner(System.in);
        int max=0;
        while(max<=5){
            System.out.println("Enter the index number");
            int m= sc.nextInt();
            try{
                max++;
                System.out.println("The element at index "+m+" is:"+marks[m]);

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Arithmetic Exception Occurred");
                System.out.println(e);
                //max=6;
            }
            if(max==5){
                System.out.println("Error");
                break;
            }
        }

    }
}
