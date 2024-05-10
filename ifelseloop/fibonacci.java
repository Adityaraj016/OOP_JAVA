package ifelseloop;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=3;i<=50;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
