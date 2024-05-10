package interfaces;
//Create a class monkey with jump ( ) and bite ( ) methods
// Create a class human whichinherits this monkey class and
// implements basicanimal interface with eat ( ) and sleep methods
interface basicanimal{
    void eat();
    void sleep();
    default void adi(){
        System.out.println("Hi");
    }
}
class monkey{
    void jump(){
        System.out.println("Monkey jumps");
    }
    void bite(){
        System.out.println("Monkey bites");
    }

}
class human extends monkey implements basicanimal{
    public void eat(){
        System.out.println("Human eats");
    }
    public void sleep(){
        System.out.println("human sleeps");
    }

//    @Override
//    public void adi() {
//        System.out.println("Hi aditya,how are u");
//    }
}
public class ques2 {
    public static void main(String[] args) {
        human h=new human();
        h.sleep();
        h.bite();
        h.adi();

        //polymorphism
        basicanimal b=new human();
        b.eat();
        //b.bite ni kar sakta only eat and sleep jo ki basicanumal me defined hai bas wahi

        //polymorphism
        monkey m=new human();
        //sirf monkey wala method
        //and jo monkey me aur human me common hai abs wahi acces hoga isse
        //in that common  case  human wala method implement hoga
    }
}
