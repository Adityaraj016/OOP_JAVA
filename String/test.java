package String;
class main{
    int height=10;
    int width=5;

    @Override
    public String toString() {
        return "Dimenstions"+height+" "+width;
    }
}
public class test {
    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e'};
        char i[] = {'1', '2', '3', '4', '5'};

        String s = new String(i, 2, 2);
        String m = new String(s);
        System.out.println(s);
        System.out.println(m);

        String age = "19";
        String su = "He is " + age + " years old";
        System.out.println(su);

        //compare to retuens the difference between the first charecters in tha two strings that differs
        String name1="Aditya";
        String name2="a";
        int dif=name1.compareTo(name2);
        System.out.println(dif);

        //index of
        int index=name1.indexOf('a');
        System.out.println(index);
        int index1=name1.indexOf("it");
        System.out.println(index1);
        System.out.println(name1.lastIndexOf("it",5));

        //replace
        String hello="My name is aditya";
        hello=hello.replace('a','s');
        String s3=hello.toString();
        System.out.println(s3);
        System.out.println(hello);


        //use of to string
        main m1=new main();
        String m2=m1.toString();
        m2="Hi";
        System.out.println(m2);

        // valueOf()  kisi bhi data ko string me badal deta hai
        int data=30;
        String str=String.valueOf(data);
        System.out.println(str+40);
    }
}
