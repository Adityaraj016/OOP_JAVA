package String;
import java.util.Scanner;
class name {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name:");
        String first=sc.nextLine();
        System.out.println("Enter last name:");
        String last=sc.nextLine();
        if(first.equals("adi")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        System.out.print("The name is:");
        System.out.println(last+" "+first);
    }
}
