package inheritance;

import java.util.Scanner;

class first{
    first(){
        System.out.println("I am a constructor");
    }
    void dis(){
        System.out.println("Hi baby");
    }

    first(float x){
        System.out.println("I am a overloaded constructor and my value is;"+x);
    }
}
class second extends first{
    second(){
        System.out.println("I am second constructor");
    }

    second(float x){
        //super(x);
        System.out.println("I am second overloaded constructor and my value is;"+x);
    }
}
class third extends first{
    third(){
        super(5);//constuctor jisme parameter hai wo acces
        System.out.println("I am third constructor");
    }

    third(int x,int y){
        //super(x);
        System.out.println("I am third overloaded constructor and my value is;"+x+"and "+y);
    }
    void dis2(){
        System.out.println("Hi baby3");
    }
    void dis(){
        System.out.println("Hi baby2");
    }
}
public class constructor_overloading {
    public static void main(String[] args) {
        //third t=new third();
        third t1=new third(5,6);
        //display();
        t1.dis();
//        first f1=new first();
//        f1.dis();//first ka hi acces hoga aise

//        first f1=new third();
//        f1.dis();//third wala acces hoga kyuki overridden hai
        //f1.dis2();//* ye galat execution hai sub wala acces nahi ho sakta isse
        //wahi sub wala acces hoga jo ki super me hai
    }
//    static void display(){
//        System.out.println("i am aditya");
//    }
}
//video 47 me boht achhe se explai kiya hai ye concept code with harry nes