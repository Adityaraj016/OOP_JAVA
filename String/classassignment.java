package String;
/*1.Aim of the program -Write a program to perform following operations on user entered strings and a character –
i)Change the case of the string
ii)Reverse the string
iii)Compare two strings
iv)Insert one string into another string
v)Convert the string to upper case and lower case
vi)Check whether the character is present in the string and at which position
vii)Check whether the string is palindrome or not.
viii)Check the number of word, vowel and consonant in the string
 */

//import java.util.Objects;
import java.util.Scanner;

public class classassignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Change the case of the string
        System.out.println("Enter the String");
        String str;
        str= sc.nextLine();
        System.out.println("Upper case:"+str.toUpperCase());
        System.out.println("Lower Case:"+str.toLowerCase());

        //Reverse the string
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println("\nReverse of string:"+sb);
        sb.reverse();

        //Compare two strings
        System.out.println("\nEnter the string for comparison");
        String str2= sc.nextLine();
        int dif=str.compareTo(str2);
        System.out.println("The difference between ASCII value is:"+dif);

        //Insert one string into another string
        System.out.println("\nEnter the string you want to insert in first String");
        str2= sc.nextLine();
        sb.append(" ");
        sb.append(str2);
        System.out.println(sb);

        //Convert the string to upper case and lower case
        System.out.println("\nEnter the String");
        String str3;
        str3= sc.nextLine();
        System.out.println("Upper case:"+str3.toUpperCase());
        System.out.println("Lower Case:"+str3.toLowerCase());

        //Check whether the character is present in the string and at which position
        System.out.println("\nEnter the String");
        str2= sc.nextLine();
        System.out.println("Enter the charecter you want to search");
        char c1=sc.nextLine().charAt(0);
        int index=str2.indexOf(c1);
        System.out.println("Position of entered character(-1 means character not found): "+index);

        //Check whether the string is palindrome or not
        System.out.println("\nEnter the String");
        str2= sc.nextLine();
        StringBuffer sb1=new StringBuffer(str2);
        sb1.reverse();
        str3=sb1.toString();
        if(str2.equalsIgnoreCase(str3)){
            System.out.println("The entered String is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        //Check the number of word, vowel and consonant in the string
        System.out.print("\nEnter a string: ");
        str2 = sc.nextLine();
        String[] words = str2.split(" ");
        int wordCount = words.length;
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowelCount);
        System.out.println("No. of consonants: " + consonantCount);
    }
}
