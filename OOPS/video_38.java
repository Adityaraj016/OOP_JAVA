package OOPS;
import java.sql.SQLOutput;
import java.util.Scanner;
/*Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)*/

import java.util.Scanner;

class Employee {
    String name;
    int salary;

    public void getname(){
        System.out.println("Employee name is:" + name);
    }

    public void setname(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of employee");
        name=sc.nextLine();
    }



    public int salary() {
        return salary;
    }

}


public class video_38 {
    public static void main(String[] args) {
        Employee adi=new Employee();
        Employee aanchal=new Employee();
        adi.setname();
        adi.salary=60000;

        aanchal.setname();;
        aanchal.salary=50000;

        adi.getname();
        aanchal.getname();

        int salary_adi= adi.salary();

        int aanchal_salary=aanchal.salary();
        System.out.println("Aditya salary is:"+salary_adi);
        System.out.println("Aanchal salary is:"+aanchal_salary);


    }
}
