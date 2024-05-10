package My_java;

import java.util.Scanner;

/*1. Write a class Account containing acc_no, balance as data members and two methods
as input() for taking input from user and disp() method to display the details.
Create a subclass Person which has name and aadhar_no as extra data members and override disp() function.
 Write the complete progrm to take and print details of three persons.


Input: Enter details of three persons.
Output: Display details of three persons.
*/
class Account {
    String acc_no;
    double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = scanner.nextLine();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLine();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Person " + (i+1));
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of Persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of Person " + (i+1));
            persons[i].disp();
        }
        System.out.println(persons[0].name);
    }
}
