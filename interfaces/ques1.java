package interfaces;
//Create an abstract class pen with methods write () and refill () as abstract methods
//Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
abstract class pen{
    abstract void write();
    abstract void refill();
}
class pentonic extends pen{
    void write(){
        System.out.println("Pen can write");
    }
    void refill(){
        System.out.println("Pen need refill");
    }
    void changenib(){
        System.out.println("Change the nib");
    }
}


public class ques1 {
    public static void main(String[] args) {
        pentonic p=new pentonic();
        p.refill();
        p.write();
    }


}
