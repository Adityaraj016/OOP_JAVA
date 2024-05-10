package Recursion;
/*Write a program using functions to print the following pattern:
****
***
**
*

 */

public class pattern {
    static void make(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        make(4);
    }
}
