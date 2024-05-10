class a{
    int real;
    int imag;
    static int a=1;
    a(int r,int i){
        real=r;
        imag=i;
    }
    void display(){
        System.out.println("Complex Number: "+a+" "+real+"+"+imag+"i");
        a++;
    }
}
class adi{
    public static void main(String[] args) {
      a c1=new a(5,10);
      a c2=new a(10,20);
      c1.display();
      c2.display();
      int resultrea=c1.real+ c2.real;
      int resultimag= c1.imag+c2.imag;

        System.out.println("The sum of complex numbers");
        System.out.println(resultrea+"+"+resultimag+"i");
    }
}