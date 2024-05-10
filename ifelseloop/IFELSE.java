package ifelseloop;
import java.util.Scanner;
//pass or fail indicator
public class IFELSE{
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5;
        float total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks");
        total=sc.nextFloat();
        System.out.println("Enter the marks is subject 1");
        sub1=sc.nextInt();
        System.out.println("Enter the marks is subject 2");
        sub2=sc.nextInt();
        System.out.println("Enter the marks is subject 3");
        sub3=sc.nextInt();
        System.out.println("Enter the marks is subject 4");
        sub4=sc.nextInt();
        System.out.println("Enter the marks is subject 5");
        sub5=sc.nextInt();

        float percentage=((sub1+sub2+sub3+sub4+sub5)/total)*100;
        System.out.println("The percentage is "+percentage);

        if(percentage<=40){
            System.out.println("Student is fail");
        }
        else{
            System.out.println("Student is pass");
        }

        //for cgpa calculation
        int cgpa=((int)percentage/10)+1;
        switch(cgpa){
            case 10:
                System.out.println("Your grade is O");
                break;
            case 9:
                System.out.println("Your grade is E");
                break;
            case 8:
                System.out.println("Your grade is A");
                break;
            case 7:
                System.out.println("Your grade is B");
                break;
            case 6:
                System.out.println("Your grade is C");
                break;
            case 5:
                System.out.println("Your grade is D");
                break;
            default:
                System.out.println("your grade is F");
        }


    }
}
