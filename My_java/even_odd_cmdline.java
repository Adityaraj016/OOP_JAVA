package My_java;

class even_odd_cmdline {
    public static void main(String[] args) {
        int even=0,odd=0;
        int [] a = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        for(int i=0;i<args.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+" is even");
                even++;
            }
            else{
                System.out.println(a[i]+" is odd");
                odd++;
            }

        }
        System.out.println("No of even:"+even);
        System.out.println("No of odd:"+odd);
    }
}
