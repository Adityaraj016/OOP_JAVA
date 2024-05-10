package interfaces;
/*Create a class telephone with ( ) , lift ( ) and disconnected ( )
methods as abstract methods create another class smart telephone and demonstrate polymorphism */
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
    private int a=10;
}
class smarttelephone extends telephone{
    @Override
    void ring() {
        System.out.println("Ringing");
    }

    void lift(){
        System.out.println("Lifting the call");
    }

    @Override
    void disconnected() {
        System.out.println("Disconnecting the call");
    }

    void checknumber(){
        System.out.println("The last call number can be displayed");
    }
}
public class ques4 {
    public static void main(String[] args) {
        telephone t=new smarttelephone();
        //isse jitne bhi telephone me methods hai wo acces kar sakte
        //and the common methods in smarttelephone can be accesed too
        //in the case smartelephone wala implement hoga
        t.disconnected();
        //t.checknumber(); this is wrong as smarttelephone ka method acces ni kar sakte with refence of telephone
        t.lift();
    }
}
