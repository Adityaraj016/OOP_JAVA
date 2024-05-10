package OOPS;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//create a class cylinder and use getter and setters to set its radius and height
//use ➊ to calculate surface and volume of the cylinder
class Cylinder{
    private float radius;
    private float height;

    public void setRadius_height(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Cylinder");
        radius=sc.nextFloat();
        System.out.println("Enter Height of Cylinder");
        height=sc.nextFloat();
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

public class video_44_ques1_2 {
    public static void main(String[] args) {
        Cylinder rc=new Cylinder();
        rc.setRadius_height();
        System.out.println(rc.surfacearea());
        System.out.println(rc.volume());

    }

}
