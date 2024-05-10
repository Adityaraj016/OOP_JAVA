//public class demo {
//    public static void main(String[] args) {
//        System.out.println(prime(83));
//    }
//    static boolean prime(int n){
//        if(n<=1){
//            return false;
//        }
//        int c=2;
//        while(c*c<=n){
//            if(n%c==0){
//                return false;
//            }
//            c++;
//        }
//        return true;
//    }
//}

import java.util.Scanner;

//3 digit armstrong numbers
public class demo{
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){
            armstrong(i);
        }

    }
    static void armstrong(int num){
        int original =num;
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(original==sum){
            System.out.println(original+" ");
        }
    }

}

