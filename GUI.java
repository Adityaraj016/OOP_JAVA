import java.util.Scanner;
class help{
    int a,b;
    void swap(int a,int b){
        int temp=a;
        this.a=b;
        this.b=temp;
    }
}
class GUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        help h=new help();
        h.swap(10,20);
        System.out.println("After swap "+h.a+" "+h.b);
//        System.out.println("Input number");
//        int num = sc.nextInt();
//        int c = 2, d = 0;
//        while (c < num) {
//            if (num % c == 0) {
//                System.out.println("Not prime");
//                return;
//            }
//            c++;
//        }
//        if (num == 1) {
//                System.out.println("not Prime");
//        } else {
//                System.out.println("Prime");
//        }

//        int a=10;
//        int b=5;
//        double c=20;
//        double d=a*b/c;
//        System.out.println(d);

//        int count =1;
//        while(count!=5){
//            System.out.println(count);
//            count++;
//        }
//        System.out.println(count++);
//        System.out.println(count);

//        char c='a';
//        if(c>=97 && c<=122){
//            System.out.println("Lower case");
//        }
//        int a=c;
//        System.out.println(a);

//        System.out.println("Enter the term");
//        int n=sc.nextInt();
//        int a=0,b=1;
//        int c=0;
//        for(int i=2;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        System.out.println(c);

//        System.out.println("Enter the number");
//        int num=sc.nextInt();
//        System.out.println("Enter the number which occurence you want to check");
//        int n= sc.nextInt();
//        int count=0;
//        int rem;
//        while(num!=0){
//            rem=num%10;
//            if(rem==n){
//                count++;
//            }
//            num=num/10;
//        }
//
//        System.out.println("The number of occurence of "+n+" is"+" "+count);



        //reverse

//        System.out.println("Enter the number you want ro reverse");
//        int num=sc.nextInt();
//        int rem,reverse=0;
//        while(num>0){
//            rem=num%10;
//            reverse=reverse*10+rem;
//            num=num/10;
//        }
//        System.out.println("Reversed number:"+reverse);
//
//        String message=greet();
//        System.out.println(message);
    }

//    static String greet(){
//        String greeting="How are you";
//        return greeting;
}


