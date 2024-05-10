package String;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int choice;
        do {
            System.out.println("\n1. Change case");
            System.out.println("2. Reverse string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert string into another string");
            System.out.println("5. Convert to uppercase and lowercase");
            System.out.println("6. Check if character is present and its position");
            System.out.println("7. Check if string is palindrome");
            System.out.println("8. Count words, vowels, and consonants");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline not consumed by nextInt()
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Uppercase: " + input.toUpperCase());
                    System.out.println("Lowercase: " + input.toLowerCase());
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Reversed string: " + new StringBuilder(input).reverse().toString());
                    break;
                case 3:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Difference between ASCII values: " +( (int) str1.charAt(0) - (int) str2.charAt(0)));
                    break;
                case 4:
                    System.out.print("Enter the first string: ");
                    String str3 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str4 = scanner.nextLine();
                    System.out.println("String after insertion: " + str3.substring(0, 3) + str4 + str3.substring(3));
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.println("Uppercase: " + input.toUpperCase());
                    System.out.println("Lowercase: " + input.toLowerCase());
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    System.out.print("Enter a character: ");
                    char ch = scanner.nextLine().charAt(0);
                    int position = input.indexOf(ch);
                    if (position != -1) {
                        System.out.println("Entered character is present at position: " + (position + 1));
                    } else {
                        System.out.println("Entered character is not present");
                    }
                    break;
                case 7:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    if (input.equals(new StringBuilder(input).reverse().toString())) {
                        System.out.println("Entered string is palindrome");
                    } else {
                        System.out.println("Entered string is not palindrome");
                    }
                    break;
                case 8:
                    System.out.print("Enter a string: ");
                    input = scanner.nextLine();
                    int words = 0, vowels = 0, consonants = 0;
                    for (char c : input.toCharArray()) {
                        if (Character.isLetter(c)) {
                            if (Character.isAlphabetic(c)) {
                                vowels += c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ? 1 : 0;
                                consonants += c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ? 1 : 0;
                            }
                            words++;
                        }
                    }
                    System.out.println("No. of words: " + words);
                    System.out.println("No. of vowels: " + vowels);
                    System.out.println("No. of consonants: " + consonants);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
        scanner.close();
    }
}
