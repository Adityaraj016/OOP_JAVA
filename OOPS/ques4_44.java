package OOPS;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
    public int area(){
        return length*breadth;
    }

}


public class ques4_44 {
    public static void main(String[] args) {
        Rectangle rc=new Rectangle(10,12);
        System.out.println(rc.area());

    }
}
