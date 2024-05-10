package interfaces;
interface bicycle{
    int a=15;
    void applybrake();
    void speedup();
}
class Avoncycle implements bicycle{
    public void applybrake(){
        System.out.println("Applying Brake");
    }
    public void speedup(){
        System.out.println("Speed up");
    }
    void display(){
        System.out.println(a);
    }
}

public class video_55 {
    public static void main(String[] args) {
        Avoncycle ac=new Avoncycle();
        System.out.println(ac.a);
        ac.applybrake();
        ac.speedup();

        bicycle b=new Avoncycle();
        System.out.println(b.a);
        b.applybrake();
        b.speedup();
    }
}
