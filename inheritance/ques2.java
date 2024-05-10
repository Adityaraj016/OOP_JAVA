package inheritance;
/*Create a class rectangle and use inheritance to create another class cuboid,
 try to keep it as close to the real-world scenario as possible
 */
class reactangle{
    int length;
    int breadth;

    reactangle(){
        this.length=20;
        this.breadth=20;
        System.out.println("I am rectangle class");
    }
    int area(){
        return length*breadth;
    }
}
class cuboid extends reactangle{
    int height;

    cuboid(){
        //this.length=20;
        this.breadth=20;
        this.height=30;
    }
    @Override
    int area(){
        int a=2*(length*breadth+length*height+breadth*height);
        return a;
    }
    int volume(){
        return length*breadth*height;
    }
}

public class ques2 {
    public static void main(String[] args) {
//        reactangle c1=new cuboid();
//        System.out.println(c1.area());
          cuboid c1=new cuboid();
          System.out.println(c1.volume());
          System.out.println(c1.area());
//        System.out.println(c1.volume());
        reactangle r1=new reactangle();
        System.out.println(r1.area());
    }
}
