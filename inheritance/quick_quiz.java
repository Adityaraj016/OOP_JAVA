package inheritance;
//Quick quiz: Create a class Animal and Derive another class dog from it

class animal{
    int age=15;

    void details(){
        age=10;
        System.out.println("I am a animal and my age is"+age);
    }
    animal(){
        age=15;
        System.out.println("age"+age);
    }
}
class dog extends animal{
    String name;
    void details(){
        //age=12;
        name="Dog";
        System.out.println("I am a dog and my age is"+age);
    }
    dog(){
        age=16;
        System.out.println(age);
    }
}

public class quick_quiz {
    public static void main(String[] args) {
        dog d=new dog();  //
        d.details();
        animal a=new animal(); //phir se animal ka constructor call hoga yaha
        a.details();
    }
}
/*first dog object banaya to wo animal ko inheg=rit kar raha
to uska constructore pehle call hoga the dog ka and data s wil be modified accordingly

ab phir normal method call honge jis sequence me aap call karenge
 */