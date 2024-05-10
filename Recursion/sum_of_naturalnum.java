package Recursion;
//Write a recursive function to calculate the sum of first n natural numbers.
public class sum_of_naturalnum {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println("the sum is:"+sum(10));
    }
}
