/*Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!*/


package OOPS;
import java.util.Scanner;
import java.util.Random;

class game{
    int com;
    int user;

    public game(){
        Random rm=new Random();
        com=rm.nextInt(0,101);     //upper bound is 101-1 =100
        //System.out.println(com);
    }

    public void takeuserinput(){
        Scanner us=new Scanner(System.in);
        user=us.nextInt();
    }

    public void noOfGuesses(int n){
        System.out.println("You guessed it in "+n+" attempts");
    }


    public void iscorrect(){
        int nguess;
        for(nguess=1;com!=user;nguess++){

            System.out.println("Guess a number between 1 to 100:");
            takeuserinput();
            if(user>com){
                System.out.println("lower number please\n");
            }
            else if(user<com){
                System.out.println("higher number please\n");
            }
            else{
                System.out.println("congrats, correct guess\n");
                noOfGuesses(nguess);
            }
        }
    }
}

public class numberguess {
    public static void main(String[] args) {
        game gm=new game();
        gm.iscorrect();
    }
}
