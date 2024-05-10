package ifelseloop;
//pattern printing

public class pattern {
    public static void main(String[] args) {
        char a='*';
        int i=4;
        for(i=4;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print(a);
            }
            System.out.println("\n");
        }
    }
}
