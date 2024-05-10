package interfaces;
interface sample{
    void meth1();
    void meth2();
}
interface childsample extends sample{
    void meth3();
    void meth4();
    default void hello(){
        System.out.println("kya re");
    }
}
class childclass implements childsample{
    public void meth1(){
        System.out.println("Method1");
    }
    public void meth2(){
        System.out.println("Method2");
    }
    public void meth3(){
        System.out.println("Method3");
    }
    public void meth4(){
        System.out.println("Method4");
    }
    //public void hello(){
   //     System.out.println("kya re2");
   // }
   // void smart(){
       // System.out.println("I am adi");
   // }
}                                     
public class inhertense {
    public static void main(String[] args) {
        childclass c=new childclass();
        c.meth1();
        childsample c1=new childclass();
        c1.meth1(); //full valid all things
        c1.hello();
        //c1.smart();  thus is wrong
        sample s=new childclass();
        //s.meth3(); it cannot be accesed becouse sample me bas 1 and 2 hi method ahai

    }
}
