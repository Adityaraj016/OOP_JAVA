package inheritance;
/*
You have to implement a library using Java Class "Library"

Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books,
Array to store the issued books
 */
import java.util.Scanner;
class books{
    String []name=new String[20];
    static int i=0;
    void addbook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book you want to add");
        name[i]=sc.nextLine();
        System.out.println("Book added:"+name[i]);
        i++;

    }
    void issuebook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book you want to issue");
        String book=sc.nextLine();
        for(int x=0;x<i;x++){
            if(name[x].equals(book)){
                System.out.println("Book issued:"+name[x]);
                int c;
                for(c=x;c<i-1;c++){
                    name[c]=name[c+1];
                }
                name[c]=null;
                i--;
                return;
            }
            System.out.println("Book does not exist");
        }
    }




    void returnbook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book you want to return");
        name[i]=sc.nextLine();
        i++;
    }
    void display(){
        for(int x=0;x<i;x++){
            System.out.println("Book "+(x+1)+":"+name[x]);
        }
    }
}
public class library {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        books b1=new books();
        do{
            System.out.println("Enter your choice");
            System.out.println("1.Addbook\n"+"2.Issuebook\n"+"3.Return book\n"+"4.Display available books\n"+
                    "5.Exit\n");
            ch=sc.nextInt();

            switch (ch){
                case 1:
                    b1.addbook();
                    break;
                case 2:
                    b1.issuebook();
                    break;
                case 3:
                    b1.returnbook();
                    break;
                case 4:
                    b1.display();
                    break;
            }
        }while(ch<5);

        System.out.println("Total number of books:"+books.i);
    }
}




//        if(i==0){
//            System.out.println("No books to issue");
//        }
//        else {
//            System.out.println("Book issued:" + name[i - 1]);
//            i--;
//        }