package Threads;

class Mythre1 extends Thread{
    static int count=0;
    Mythre1(String name){
        super(name);
    }
    @Override
    public void run() {
        int i=0;
        while(i<10){
            System.out.println("My name is"+this.getName());
            i++;

        }
    }
}
public class priorities {
    public static void main(String[] args) {
        Mythre1 m1=new Mythre1("Aditya");
        Mythre1 m2=new Mythre1("Aaanchal");
        Mythre1 m3=new Mythre1("Adiya");
        Mythre1 m4=new Mythre1("Lite");
        Mythre1 m5=new Mythre1("Bhatta");
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m3.setPriority(Thread.NORM_PRIORITY);
        m4.setPriority(Thread.NORM_PRIORITY);
        m5.setPriority(Thread.NORM_PRIORITY);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        System.out.println(m2.getPriority());
        System.out.println("Count:"+Mythre1.count);
    }
}
