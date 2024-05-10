package My_java;
/*2. wap in java to input and display the details of n number of students having roll,
 name and cgpa as data members. also display the name of the student having lowest cgpa.
 */

import java.util.Scanner;

class Student{
    int roll;
    String name;
    float cgpa;

}
public class CGPA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of students");
        int n=sc.nextInt();
        Student[] students=new Student[n];

        for(int i=0;i<n;i++){
           students[i]=new Student();

            System.out.println("Enter the details of "+ (i+1) +" Student");
            System.out.print("Roll:");
            students[i].roll=sc.nextInt();
            sc.nextLine();   //to free buffer //VVI
            System.out.print("Name:");
            students[i].name=sc.nextLine();
            System.out.print("CGPA:");
            students[i].cgpa=sc.nextFloat();
        }
        //to display and to display lowest cgpa

        float lowestcgpa=students[0].cgpa;
        String student_name=students[0].name;

        for (int i = 0; i < n; i++) {
            System.out.println("Roll:"+students[i].roll+" Name:"+students[i].name
            +" CGPA:"+students[i].cgpa);
                if(students[i].cgpa<lowestcgpa){
                    lowestcgpa=students[i].cgpa;
                    student_name=students[i].name;
                }

        }
        //display lowest cgpa
        System.out.println("The lowest cgpa is "+lowestcgpa+" and name of student is "+student_name );
    }
}

