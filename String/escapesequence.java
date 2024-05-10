package String;
/*Write a program to format the following letter using escape sequence characters.
Letter = “Dear Harry, This Java Course is nice. Thanks”*/

public class escapesequence {
    public static void main(String[] args) {
        System.out.println("\"Dear Harry, This Java Course is nice. Thanks\"");

        String myletter="Dear <|name|>, Thanks a lot!";
        System.out.println(myletter.replace("<|name|>","Aditya"));
    }
}
