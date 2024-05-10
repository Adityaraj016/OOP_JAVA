package Threads;
class Mthr1 implements Runnable{

    @Override
    public void run() {
        System.out.println("I am Aditya's thread    i");
    }
}
public class test {
    public static void main(String[] args) {
        Mthr1 bullet=new Mthr1();
        Thread t1=new Thread(bullet,"Adi");
        t1.start();
        System.out.println("ID:"+t1.getId());
        System.out.println("Name:"+t1.getName());


    }
}