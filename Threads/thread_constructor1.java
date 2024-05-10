package Threads;
class Mythr extends Thread{
    Mythr(){
        System.out.println("Hi");
    }
    Mythr(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("I am Aditya's thread");
    }
}
public class thread_constructor1 {
    public static void main(String[] args) {
        Mythr m1=new Mythr();
        Mythr m2=new Mythr("Adi");
        m1.start();
        m2.start();
        System.out.println("The Id of m1 thread is "+m1.threadId());
        System.out.println("The name of m1 thread is "+m1.getName());
        System.out.println("The Id of m1 thread is "+m2.getId());
        System.out.println("The name of m1 thread is "+m2.getName());
    }
}
