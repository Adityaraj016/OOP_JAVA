package ExceptionHandling;
import java.util.Scanner;

public class arryoutofbounds {
    public static <arrayIndexOutofBoundsException> void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []marks={56,67,90,89,51};
        System.out.println("Enter the array index number,which marks you want to access");
        int n=sc.nextInt();
        System.out.println("Enter the number you want to divide the marks with");
        int m= sc.nextInt();
        try{
            System.out.println("The marks is:"+marks[n]);
            System.out.println("Result of division:"+50/m);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurred.Please enter the valid input");
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array Index out of Bounds Exception occurred");
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println("Some Exceptions Occurred");
        }

        System.out.println("Program executed successfully");
    }
}
