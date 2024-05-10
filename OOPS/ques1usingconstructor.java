package OOPS;
//Use a constructor and repeat ➊

import java.util.Scanner;

class Cylinder1{
    private float radius;
    private float height;


    public Cylinder1(float r,float h){
        radius=r;
        height=h;
    }


    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }

    public float surfacearea(){
        return ((2*3.14f*radius*height)+(2*3.14f*radius*radius));
    }
    public float volume(){
        return (3.14f*radius*radius*height);
    }


}
public class ques1usingconstructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Cylinder");
        float r=sc.nextFloat();
        System.out.println("Enter Height of Cylinder");
        float h=sc.nextFloat();
        Cylinder1 rc=new Cylinder1(r,h);
        System.out.println(rc.surfacearea());
        System.out.println(rc.volume());
    }
}
