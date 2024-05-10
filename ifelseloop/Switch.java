package ifelseloop;
import java.util.Scanner;
//using switch
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int var;
        System.out.println("Enter the variable");
        var=sc.nextInt();
        switch(var){
            case 1:
                System.out.println("the number is 1");
                break;
            case 2:
                System.out.println("the number is 2");
                break;
            case 3:
                System.out.println("the number is 3");
                break;
            default:
                System.out.println("the number is not valid");
                break;

        }

//        String name="harry";
//        switch (name){
//            case "harry":
//                System.out.println("ypu are harry");
//                System.out.println("hi");
//                break;
//            default:
//                System.out.println("hello");
//
//        }

    }
}
