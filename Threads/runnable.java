package Threads;

class Mythread3 implements Runnable{
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
class Mythread4 implements Runnable{
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
public class runnable {
    public static void main(String[] args) {
        Mythread3 m3=new Mythread3();
        Thread t1=new Thread(m3);
        t1.start();
        Mythread4 m4=new Mythread4();
        Thread t2=new Thread(m4);
        t2.start();
    }
}
