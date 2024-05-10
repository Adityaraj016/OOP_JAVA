package Recursion;
//Write a function to find the average of a set of numbers passed as arguments.
public class avg {
    static float average(int ...arr){
        int n=arr.length;
        float sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        return sum/n;
    }
    public static void main(String[] args) {
        System.out.println(average(20,20,20,40,100));

    }
}
