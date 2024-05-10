package Threads;
import java.util.ArrayList;

class mThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("Welcome");
            i++;
        }

    }
}
class mThread2 extends Thread {
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("Good Morning");
            i++;
        }
    }
}
public class join {
    public static void main(String[] args) {
        mThread1 t1= new mThread1();
        mThread2 t2= new mThread2();
        t1.setPriority(5);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(t1.getState());
        t2.start();

    }
}