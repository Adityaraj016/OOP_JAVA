package Recursion;

public class pattern2 {

    static void make(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    static void make(int n){
//        if(n>0){
//            make(n-1);
//            for(int i=n;i>=1;i--){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        make(4);
    }
}
