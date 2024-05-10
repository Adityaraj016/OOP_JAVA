package My_java;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class NumberProcessor {

    public void ProcessInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: " + (num * 2)); // Display double value
        }
    }

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        try {
            processor.ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

