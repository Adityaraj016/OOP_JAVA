package ExceptionHandling;

import java.util.Scanner;

class maxlimitexception1 extends Exception{
    @Override
    public String toString() {
        return "Max limit reached of 5 retries";
    }
}
public class ques5 {
    public static void array() throws maxlimitexception1 {
        throw new maxlimitexception1();
    }

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
                try{
                    array();
                }
                catch (Exception e){
                    System.out.println(e.toString());
                }
                break;
            }
        }
    }
}
