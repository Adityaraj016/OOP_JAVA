//Write a program to find out whether a given integer is present in an array or not.
package Array;
import java.util.Scanner;
class A{
    static void display(){
        System.out.println("I am aditya");
    }
    void adi(){
        display();
    }
    int [] dis(int []z){
        for(int a:z){
            System.out.println(a);
        }
        int a[]={1,2,3,4,5};
        return a;
    }

}
public class check {
    static void display(){
    System.out.println("I am aditya");
}
public void adi(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {

        A am=new A();
        int []z={1,2,3};
        int []b=am.dis(z);
        for(int a:b){
            System.out.println(a);
        }
        int []A1={1,2,3,4,5};
        display();



        check c=new check();
        c.adi();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<A1.length;i++){
            if(A1[i]==x){
                System.out.println("THe number is present in array at index "+i);
                count++;
            }
        }
        if(count==0){
            System.out.println("THe number is not present in array");
        }
    }
}
