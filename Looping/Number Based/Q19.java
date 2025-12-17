import java.util.*;

public class Q19
{
   public static void main(String[] args )
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sq=n*n;
    int temp=n;
    int d=0;
    while(temp>0)
    {
         d++;
         temp/=10;
    }
    int mod=(int)Math.pow(10,d);
    if(sq%mod==n)
    {
        System.out.println("Automorphic");
    }
    else
    {
       System.out.println("Not Automorphic");
    }











   }   
}
