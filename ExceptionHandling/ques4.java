package ExceptionHandling;

//4 Modify program in Q3 to throw a custom Exception if max retries are reached.
import java.util.Scanner;
class maxlimitexception extends Exception{
    @Override
    public String toString() {
        return "Max limit reached";
    }
}
public class ques4 {
    public static void main(String[] args) {
        int[] marks = {50, 60, 70, 80, 90, 100, 95, 80};
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (max <= 5) {
            System.out.println("Enter the index number");
            int m = sc.nextInt();
            try {
                max++;
                System.out.println("The element at index " + m + " is:" + marks[m]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Arithmetic Exception Occurred");
                System.out.println(e);
                //max=6;
            }
            if (max == 5) {
                try {
                    throw new maxlimitexception();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                break;
            }
        }

    }
}
