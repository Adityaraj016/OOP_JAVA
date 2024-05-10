package My_java;
import java.util.Scanner;
class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,n,temp,sum=0;

        System.out.println("Enter the Number");
        n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }
        if(temp==sum){
            System.out.println("Pallindrome number");
        }
        else{
            System.out.println("Not a pallindrome");
        }



    }
}
