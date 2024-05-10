//Create a Java program to add two matrices of size 2x3.
package Array;
import java.util.Scanner;
public class matrixadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]M1=new int[2][3];
        int [][]M2=new int[2][3];
        //int [][]M3=new int[2][3];
        System.out.println(M1.length);
        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<M1.length;i++){
            for(int j=0;j<M1[i].length;j++){
                M1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<M2.length;i++){
            for(int j=0;j<M2[i].length;j++){
                M2[i][j]=sc.nextInt();
            }
        }
        //to consume less space we willl store the result in M2

        for(int i=0;i<M2.length;i++){
            for(int j=0;j<M2[i].length;j++){
                M2[i][j]=M1[i][j]+M2[i][j];
            }
        }
        System.out.println("The matrix after the addition of two matix is ");
        for(int i=0;i<M2.length;i++){
            for(int j=0;j<M2[i].length;j++){
                System.out.print(M2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
