package My_java;
//5. wap using constructor overloading concept to calculate the area of a rectangle
// having data member as length and breadth.
// use default constructor to initialize the value of data member to 0 and parameterized
// constructor according to user input.
import java.util.Scanner;

class dimensions{
    float length;
    float breadth;

    dimensions(){
        length=0f;
        breadth=0f;
    }
    dimensions(float l,float b){
        length=l;
        breadth=b;

    }
    float area(){
        return length*breadth;
    }
}

class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dimensions d1=new dimensions();
        System.out.println("Enter length of rectangle(in cm)");
        float l=sc.nextFloat();
        System.out.println("Enter breadth of rectangle(in cm)");
        float b=sc.nextFloat();
        dimensions d2=new dimensions(l,b);
        System.out.println("Default Area:"+d1.area()+" sq cm");
        System.out.println("Area according to user input values:"+d2.area()+" sq cm");
    }

}
