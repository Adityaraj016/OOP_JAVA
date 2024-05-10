package My_java;

public class ques2 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // Attempt to divide by zero (causing ArithmeticException)
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }
}

