package ifelseloop;
import java.util.Scanner;
import java.util.Random;
//Rock, Paper Scissors Game in Java
public class RockPaperscissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random num=new Random();
        int computer=num.nextInt(1,4);//upper bound -1 number genertate hoga
        //System.out.println(computer);

        System.out.println("Enter you choice");
        System.out.println("1 means rock,2 means paper,3 means scissor,any other is invalid");
        int user=sc.nextInt();
        if(computer==user){
            System.out.println("both computer and you choose same");
            System.out.println("game draw");
        }
        else if(computer==1 && user ==2){
            System.out.println("computer chooses rock and you paper");
            System.out.println("you won");
        }
        else if(computer==1 && user ==3){
            System.out.println("computer chooses rock and you scissor");
            System.out.println("computer wins");
        }
        else if(computer==2 && user ==1){
            System.out.println("computer chooses paper and you rock");
            System.out.println("computer wins");
        }
        else if(computer==2 && user ==3){
            System.out.println("computer chooses paper and you scissor");
            System.out.println("you won");
        }
        else if(computer==3 && user ==1){
            System.out.println("computer chooses scissor and you rock");
            System.out.println("you won");
        }
        else if(computer==3 && user ==2){
            System.out.println("computer chooses scissor and you paper");
            System.out.println("computer wins");
        }


    }
}
