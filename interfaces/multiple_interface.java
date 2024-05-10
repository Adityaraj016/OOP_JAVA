package interfaces;

interface cycle{
    int a=15;
    void applybrake();
    void speedup();
}
interface bike{
    int b=45;
    void speed();
    void fuel();
}
class Herocycle implements cycle,bike{
    public void applybrake(){
        System.out.println("Applying Brake");
    }
    public void speedup(){
        System.out.println("Speed up");
    }
    void display(){
        System.out.println(a);
    }
    public void speed(){
        System.out.println("top speed=101 km/hr");
    }
    public void fuel(){
        System.out.println("500 ka petrol dalwa do malik");
    }
}

public class multiple_interface {
    public static void main(String[] args) {
        Herocycle ac=new Herocycle();
        System.out.println(ac.a);
        ac.applybrake();
        ac.speedup();
        ac.fuel();
        ac.speed();

        cycle b=new Herocycle();
        System.out.println(b.a);
        b.applybrake();
        b.speedup();
        //b.speed(); this is illegal we cant do this as dono onterface alag hai
        bike b1=new Herocycle();
        System.out.println(b1.b);
        b1.speed();
        b1.fuel();
    }
}
