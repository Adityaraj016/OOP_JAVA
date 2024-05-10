package Threads;
//Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.
import java.util.ArrayList;

class Thre1 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thre2 extends Thread {
    public void run() {
        System.out.println("Good morning");
    }
}
public class question3 {
    public static void main(String[] args) {
        Thre1 t1= new Thre1();
        Thre2 t2= new Thre2();
        t2.start();
        t1.start();
        t1.setPriority(5);
        t2.setPriority(1);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
