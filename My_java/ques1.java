package My_java;

import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        int[] numbers = new int[numElements];

        System.out.println("Enter the elements (separated by spaces): ");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            System.out.print("Enter the index to access (0-" + (numElements - 1) + "): ");
            int index = scanner.nextInt();
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
}
