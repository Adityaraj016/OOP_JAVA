package My_java;
//3. wap to overload subtract method with various parameters in a class in java.
// write the driver class to use the different subtract methods using object.

import java.util.Scanner;
class subtraction{
    int a;
    int b;
    int subtract(){
        a=10;
        b=15;
        return b-a;
    }

    int subtract(int m,int n){
        a=m;
        b=n;
        return n-m;
    }
}
public class MathOperationsDemo {
    public static void main(String[] args) {
        subtraction sub=new subtraction();
        int x;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your choice:");
            System.out.println("1.Without passing parameter\n"+"2.Passing parameters\n"+"3.exit\n");
            x=sc.nextInt();

            switch(x) {
                case 1:
                    int c = sub.subtract();
                    System.out.println("The difference is:" + c + "\n");
                    break;

                case 2:
                    System.out.println("Enter the two numbers");
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    int o = sub.subtract(m, n);
                    System.out.println("The difference is:" + o + "\n");
                    break;
            }


        }while(x<3);

    }
}


//import java.util.Scanner;
//
//class MathOperations {
//
//    int Intsub(int a,int b){
//        return b-a;
//    }
//    double Doubsub(double a,double b){
//        return b-a;
//    }
//    int arraysub(int []num){
//        int c=num[0];
//        for(int i=1;i< num.length;i++){
//            c=c-num[i];
//        }
//        return c;
//    }
//
//}
//
//public class MathOperationsDemo {
//
//    public static void main(String[] args) {
//        MathOperations math = new MathOperations();
//        int x;
//        Scanner sc=new Scanner(System.in);
//        do{
//            System.out.println("Enter your choice:");
//            System.out.println("1.Subtract method for two integers\n"+"2.Subtract method for two doubles\n"+
//                    "3.Subtract method for an array of integers(First element-all elemets)\n"+"4.Exit\n");
//            x=sc.nextInt();
//
//            switch(x){
//                case 1:
//                    System.out.println("Enter the two numbers");
//                    int a= sc.nextInt();
//                    int b= sc.nextInt();
//                    int c=math.Intsub(a,b);
//                    System.out.println("The difference is:"+c+"\n");
//                    break;
//
//                case 2:
//                    System.out.println("Enter the two numbers");
//                    double m= sc.nextDouble();
//                    double n= sc.nextDouble();
//                    double o=math.Doubsub(m,n);
//                    System.out.println("The difference is:"+o+"\n");
//                    break;
//
//                case 3:
//                    System.out.println("Enter the size of array");
//                    int d= sc.nextInt();
//                    int []num=new int[d];
//                    System.out.println("Enter the elements of array");
//                    for(int i=0;i<d;i++){
//                        num[i]= sc.nextInt();
//                    }
//                    int e= math.arraysub(num);
//                    System.out.println("The difference is:"+e+"\n");
//                    break;
//            }
//
//        }while(x<4);
//    }
//}