package ExceptionHandling;

public class Finallyblock {
    public static int greet(){
        try{
            int a=10;
            int b=0;
            return a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally block and will always bhi executed");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
        int a=10;
        int b=10;
        while(true){
            try{
                System.out.println("A/B:"+a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("The value of b is:"+b);
            }
            b--;
        }
    }
}
