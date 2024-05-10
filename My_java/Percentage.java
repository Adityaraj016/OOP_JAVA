package My_java;
import java.util.Scanner;

//to find percantage of student

public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks is Maths");
		int a=sc.nextInt();
		System.out.println("Enter marks is Sst");
		int b=sc.nextInt();
		System.out.println("Enter marks is English");
		int c=sc.nextInt();
		System.out.println("Enter marks is Hindi");
		int d=sc.nextInt();
		System.out.println("Enter marks is Science");
		int e=sc.nextInt();
		
		double avg=(a+b+c+d+e)/500.0;
		double percentage=avg*100.0;
		System.out.println(avg);
		System.out.println(percentage);

	}

}
