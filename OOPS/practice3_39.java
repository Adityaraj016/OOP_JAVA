package OOPS;
//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class cellphone{
    public void Ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void call(){
        System.out.println("Calling...");
    }
}
public class practice3_39 {
    public static void main(String[] args) {
        cellphone cp=new cellphone();
        cp.call();
        cp.Ring();
        cp.vibrate();

    }
}
