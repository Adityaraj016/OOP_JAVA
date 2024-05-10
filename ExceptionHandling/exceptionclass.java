package ExceptionHandling;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String getMessage() {
        return super.getMessage()+"hi";
    }
    @Override
    public String toString(){
        return super.toString();
    }

}

public class exceptionclass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a<10){
            try{
               throw new MyException();
              //throw new ArithmeticException("//This is arithmetic exception");
               //throw new Exception();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }
        }
    }
}
