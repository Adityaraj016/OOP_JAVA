package Labassigment;

import java.util.Scanner;

/*1. Aim of the program - Write a program in Java using multi-threading (implementing Runnable interface)
which will display a counter value within a specified range with a gap of 5 milliseconds
after setting it’s name as given by the user.
Input : Name of the thread - First
Lower range of counter - 10
Upper range of counter - 15
Output : Thread - First
Counter - 10 11 12 13 14 15
*/
class mythread implements Runnable{
    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower range of counter:");
        int lower= sc.nextInt();
        System.out.print("Enter upper range of counter:");
        int upper= sc.nextInt();
        System.out.println("Thread:"+Thread.currentThread().getName()); //VVI
        System.out.print("Counter-");
        for(int i=lower;i<=upper;i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of thread:");
        String name= sc.nextLine();
        mythread bullet=new mythread();
        Thread t1=new Thread(bullet,name);
        t1.start();

    }
}
