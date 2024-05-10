package OOPS;
import java.util.Scanner;
//Create a class Square
// with a method to initialize its side, calculating area, perimeter etc.

class square{
    float side;

    public void side(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side in meters");
        side=sc.nextFloat();

        area();
        perimeter();
    }

    public void area(){
        System.out.println("Area of the square is:"+side*side+" sq met");
    }
    public void perimeter(){
        System.out.println("Perimeter of the square is:"+4*side+" met");
    }
}

public class pratice2_39 {
    public static void main(String[] args) {
        square sq=new square();
        sq.side();

    }
}
