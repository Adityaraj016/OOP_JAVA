package ifelseloop;
import java.util.Scanner;
class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks out of hundred");
        int marks=sc.nextInt();
        if(marks <40){
            System.out.println("Grade=F");
        }
        else if(marks >=40 && marks<50){
            System.out.println("Grade=D");
        }
        else if(marks >=50 && marks<60){
            System.out.println("Grade=C");
        }
        else if(marks >=60 && marks<70){
            System.out.println("Grade=B");
        }
        else if(marks >=70 && marks<80){
            System.out.println("Grade=A");
        }
        else if(marks >=80 && marks<90){
            System.out.println("Grade=E");
        }
        else if(marks >=90 && marks<=100){
            System.out.println("Grade=O");
        }
        else{
            System.out.println("Invalid marks");
        }
    }
}
