package String;
import java.util.Scanner;
//Write a Java program to detect double and triple spaces in a string
public class Detector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String m=sc.nextLine();
        String []n =new String[5];
        n[0]=sc.nextLine();
        String name="Hi my name is    Aditya";
        System.out.println(name.indexOf("   "));
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("a",13));
        System.out.println(name.charAt(22));
        System.out.println(name.substring(5,22));
        System.out.println(name.equals("Hi my name is   Aditya"));
    }
}
