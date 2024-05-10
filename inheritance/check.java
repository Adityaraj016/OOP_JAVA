package inheritance;


import org.w3c.dom.ls.LSOutput;

class Base{
    public int x;
    private int z=10;
    int s=10;
    class M {
        void display(){
            System.out.println(z);
        }
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println(s);
    }
}

public class check {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        int []a={1,2,3,4,5};
        String []s={"Adi","aanchal"};
        for(String z:s){
            System.out.println(z);
        }
        for(int c:a){
            System.out.println(c);
        }
        Derived d=new Derived();
        d.setX(5);


        Base.M m1=b.new M();
        m1.display();

        // Creating an object of derived class
//        Derived d = new Derived();
//        d.setX(43);
//        System.out.println(d.getX());
//        System.out.println(b.getX());

       ///base se derived ko acces nahi kar sakte
        //but derived se base ke elements ko access kar sakte hai
    }
}

