package interfaces;

import java.util.Scanner;

//Create an interface TVremote and use it to inherit another interface smart TVremote
//Create a class TV which implements TVremote interface from Q6
interface TVremote{
    void changechannel(int num);
    void volumeup();
    void volumedown();
    default void tvremote(){
        System.out.println("I am remote of distv");
    }
}
interface smartTVremote extends TVremote{
    void channelno();
    void genre();
}
class tv implements smartTVremote{
    public void changechannel(int  num){
        System.out.println("Channel changed to "+num);
    }
    public void volumeup(){
        System.out.println("Volume up by 1");
    }
    public void volumedown(){
        System.out.println("Volume down by 1");
    }
    public void channelno(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter channel no:");
        int n=sc.nextInt();
        changechannel(n);
    }
    public void genre(){
        System.out.println("The genre availabel are\n"+"1.Music\n"+"2.Movies\n" +
                "3.Cartoon\n"+"4.News\n");
    }
}
public class lastques {
    public static void main(String[] args) {
        tv t=new tv();
        t.channelno();
        t.tvremote();//defalut bhi class ke object se acess kar skate hai

        //polymorphism or dynammic method dispatch
        TVremote tv=new tv();
        tv.tvremote();
        tv.volumedown();
        tv.changechannel(989);
        //tv.genre(); this is wrong as TVremote inteface hai and khud l=ka bas implement karega
        //dusre interface and class ka wo acces ni kar sakta

    }
}
