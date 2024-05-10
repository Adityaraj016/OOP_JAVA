package My_java;
class units{
    int real;
    int img;

    units(){
        real=5;
        img=4;
    }
    units(int r,int i){
        real=r;
        img=i;
    }

    void add(int r1,int r2,int i1,int i2){
        int addreal=r1+r2;
        int addimg=i1+i2;
        System.out.println(addreal+"+"+addimg+"i");
    }
}

public class test_lab1 {
    public static void main(String[] args) {
        units c1=new units();
        units c2=new units(6,5);
        c1.add(c1.real,c2.real,c1.img,c2.img);   //this approach should be followe in lab tests
    }
}
