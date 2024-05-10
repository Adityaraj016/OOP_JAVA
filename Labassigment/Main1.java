package Labassigment;
/*2. Aim of the program - Write a program in Java using multi-threading
 (extending the Thread class) which will display a counter value
 within a specified range with a gap of 5 milliseconds after setting it’s name as given by the user.
Input : Name of the thread - First
Lower range of counter - 10
Upper range of counter - 15
Output : Thread - First
Counter - 10 11 12 13 14 15
*/

import java.util.Scanner;

class mythread1 extends Thread{
    mythread1(String name){
        super(name);
    }
    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range of counter");
        int lower= sc.nextInt();
        System.out.println("Enter upper range of counter");
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
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of thread");
        String name= sc.nextLine();
        mythread1 t1=new mythread1(name);
        t1.start();
    }
}
