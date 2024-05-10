package Threads;

//Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
import java.util.ArrayList;

class Thread1 extends Thread{
    public void run(){
        while (true){

        try{
            Thread.sleep(1);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Welcome");
    }
    }
}
class Thread2 extends Thread {
    public void run() {
        while (true){
            System.out.println("Good morning");
        }
    }
}
public class question2 {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
    }
}