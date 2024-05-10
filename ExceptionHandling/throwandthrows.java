package ExceptionHandling;

public class throwandthrows {
    public static int divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        try{
            int c=divide(6,0);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception occurred");
        }
    }
}
