package adi;
import java.util.Scanner;

class aditya{
    public void hi(){
        System.out.println("Hello aanchal");
    }
    public void display(){
        System.out.println("Hi re");
    }
}
public class hello {
    public static void main(String[] args) {
        aditya a1=new aditya(){
            public void hi(){
                System.out.println("Hello aditya");
            }
        };
        a1.hi();
    }
}
