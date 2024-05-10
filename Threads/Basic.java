package Threads;
class Mythread1 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println("Aditya Loves Aanchalite");
            System.out.println("Will u marry me");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println("Aditya is going to be a successful trader");
            System.out.println("Mere sath bali chalogi ghumne");
            i++;
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
}
