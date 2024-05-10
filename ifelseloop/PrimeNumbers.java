package ifelseloop;

public class PrimeNumbers
{
public static void main (String[] args)
{
    int i =0;
    int num =0;
    //Empty String
    //String  primeNumbers = "";
    System.out.println("Prime numbers from 1 to 100 are :");
    for (i = 1; i <= 100; i++)//i=2
    {
        int counter=0;
        for(num =i; num>=1; num--)         /*num==2,*/
                  {
            if(i%num==0)
            {
                counter = counter + 1;
            }
                      //num=1
        }


        if (counter ==2)
        {
            System.out.print(i+" ");
        }
    }

}
}
