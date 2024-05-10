package String;
/*Write a Java program to convert a string to lowercase.
Write a Java program to replace spaces with underscores.*/
public class string {
    public static void main(String[] args) {
        String name="Aditya Raj Cse 48";
        System.out.println(name.toUpperCase());
        System.out.println(name);
        StringBuffer sb=new StringBuffer(name);
        sb.delete(1,2);
        System.out.println(sb);
        //both above statements are same.
    }
}
//multiple word in string input can be given