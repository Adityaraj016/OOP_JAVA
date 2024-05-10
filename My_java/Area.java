package My_java;
//4. wap which will overload the area method and display the area of circle,
// triangle and a square as per user choice and user enter dimensions.
import java.util.Scanner;
class dimension{
    float area(float r){
        return 3.14f*r*r;
    }
    float area(float b,float h){
        return .5f*b*h;
    }
    float area(int side){
        return side*side;
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dimension d=new dimension();
        int n;
        do{
            System.out.println("Enter your choice");
            System.out.println("1.Area of Circle\n"+"2.Area of Triangle\n"+"3.Area of square\n"+"4.Exit\n");
            n= sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the radius of circle(in cm)");
                    float radius= sc.nextFloat();
                    float a=d.area(radius);
                    System.out.println("Area of Circle:"+a+" sq cm\n");
                    break;
                case 2:
                    System.out.println("Enter base and height of triangle(in cm)");
                    float base= sc.nextFloat();
                    float height= sc.nextFloat();
                    float b=d.area(base,height);
                    System.out.println("Area of Triangle:"+b+" sq cm\n");
                    break;
                case 3:
                    System.out.println("Enter the side length of square(in cm)");
                    int side= sc.nextInt();
                    float c=d.area(side);
                    System.out.println("Area of Square:"+c+" sq cm\n");
                    break;
            }

        }while(n<4);
    }
}
