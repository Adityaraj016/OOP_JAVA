class mythread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Adiya");
        }

    }
}

class Main{
    public static void main(String[] args) {
        mythread m1=new mythread();
        m1.setName("Adi");
        m1.start();

        StringBuffer sb=new StringBuffer("Aditya");
        sb.insert(3,"adi");
        System.out.println(sb);
        String str="Adi";
        String str2=str.concat("ditya");
        System.out.println(str2);
    }
}