package String;
//to test differnt functions and operations of string buffer
public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());

        //append se last me kuch bhi add kar sakte hai
        sb.append("Aditya");
        System.out.println(sb);

        //ensure capacity
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.append("hi");
        System.out.println(sb.capacity());

        //set lenght
        //sb.setLength(4);
        System.out.println(sb.capacity());
        sb.append("Mai hu ek udta robot");
        System.out.println(sb);
        //sb.setLength(20);
        System.out.println(sb);

        //set char
        sb.setCharAt(0,'i');
        System.out.println(sb);
        sb.insert(10,"adi");
        System.out.println(sb);

        //
        sb.replace(1,2,"aa");
        System.out.println(sb);  //normal string me replace ka alag hai thoda


        //substrinf(start,end) is same here also

        //delete
        sb.deleteCharAt(1);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.delete(1,20);
        System.out.println(sb);

        //index of wala
        System.out.println(sb.indexOf("robo"));
        System.out.println(sb.indexOf("o",1));
        System.out.println(sb.lastIndexOf("ob"));
        System.out.println(sb.lastIndexOf("ob",10));

        sb.trimToSize();
        System.out.println(sb);
    }
}
