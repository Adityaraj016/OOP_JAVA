package OOPS;

class myemp {
    private int id;
    private String name;

    public myemp() {
    id=45;
    name="Aditya";
    }

    public myemp(String n,int i) {
        id=i;
        name=n;
    }


    public myemp(String n) {
        name=n;
    }

    public void getname(){
        System.out.println("Employee name is:" + name);
    }



}

public class constructor_42 {
    public static void main(String[] args) {
        myemp adi=new myemp();
        myemp adi1=new myemp("Adi");
        myemp adi2=new myemp("Rajput",16);
        adi1.getname();
        adi.getname();
        adi2.getname();


    }
}
