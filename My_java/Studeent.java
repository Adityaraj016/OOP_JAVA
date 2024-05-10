package My_java;
//1. wap to find number of objects created out of the class using static modifier. (create a class student)
class details{
    int roll;
    String name;
    static String sec;
    static int count=0;
    details(int r,String n,String s){
        roll=r;
        name=n;
        sec=s;
        count++;
    }
}
public class Studeent {
    public static void main(String[] args) {
        details d1=new details(22051829,"Aditya","Cse 48");
        details d2=new details(22051826,"Aditya Raj","CSE 48");
        details d3=new details(22051835,"Aanchal Bhatta","CSE 45");
        System.out.println("Name:"+d1.name);
        System.out.println("Sec:"+details.sec);
        System.out.println("No of objects:"+details.count);
    }
}

//static variable sirf constructor_name. se accesss kar sakte hai
//object. se bhi kar sakte
//static nahi rehta to constructor. se acess ni kar pate and object. se access karte to harbar count 1 hi rehjata