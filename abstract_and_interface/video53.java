package abstract_and_interface;

abstract class base{
    int a=45;
    base(){
        System.out.println("Hi");
    }
    void adi(){
        System.out.println("Adi");
    }
    abstract void greet();
    abstract void greet2();
}
class child1 extends base{
    int length;
    child1(){
        System.out.println("hi i am child one");
    }
    void greet(){
        System.out.println("I am ju aditya 1");
    }

    @Override
    void greet2() {
        System.out.println("I am a loser");
    }

    void adi2(){
        System.out.println("Adi2");
    }
}
class child3 extends child1{
    child3(){
        System.out.println("hi i am child three");
    }
    void greet(){
        System.out.println("I am aditya rajput");
    }

    @Override
    void greet2() {
        System.out.println("I am a loser singh");
    }
}
abstract class child2 extends base{
    child2(){
        System.out.println("hi i am child 2");
    }
    abstract void hi();

}

class child4 extends child2{
    void greet(){
        System.out.println("I am child4");
    }

    @Override
    void greet2() {
        System.out.println("I am a loser child4");
    }
    void hi(){
        System.out.println("hi");
    }
}
public class video53 {
    public static void main(String[] args) {
        child1 cum=new child3();
        cum.greet();
        base v=new child1();
        v.greet();
        child1 c=new child1();
        c.greet();
        c.greet2();
        c.length=10;    //aise bhi class ke elemts ko acces kar sakte normally
        System.out.println(c.length);//acess kar sakte par modify nahi
        System.out.println(c.a);
        child3 c2=new child3();
        c2.greet2();
        c2.greet();
        //child2 c4=new child2();  error child2 bhi abstract hai to uski object nahi banegi
        child4 c4=new child4();
        c4.hi();
        c4.greet2();

        base b=new child1();
        b.greet();  //this is possible it can implement child methods(only those which are present in base)
        // as well as base methods
         //but agar same method hua child me to wo implenet hoga na ki base wala
        //dynamic dipatch notes
        b.adi();
        System.out.println(b.a);
    }
}
