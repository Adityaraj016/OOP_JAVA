package ExceptionHandling;

import java.util.Scanner;

class NegativeradiusException extends Exception{
    @Override
    public String toString() {
        return "Negative radius provided";
    }

    @Override
    public String getMessage() {
        return "Negative radius provided" ;
    }
}
public class throwandthrows2 {
    public static double area(int r)throws NegativeradiusException{
        if(r<0){
            throw new NegativeradiusException();
        }
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the radius");
            int r=sc.nextInt();
            System.out.println("The area is:" + area(r));
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }
}
