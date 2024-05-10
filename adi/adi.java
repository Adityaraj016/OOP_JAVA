package adi;

import org.w3c.dom.ls.LSOutput;

class rectangle {
    int length;
    int breadth;
    void rec(){
        this.length=5;
        display(length);
    }
    void display(int length) {
        System.out.println(length);
    }
}
public class adi {
    public static void main(String[] args) {
        rectangle rc=new rectangle();
        rc.rec();
        //rc.display();
        rc.length=10;
        rc.breadth=10;
        int []a={1,2,3};
        System.out.println(rc.length);
        System.out.println(a.length);
        System.out.println(rc.length*rc.breadth);
    }
}
