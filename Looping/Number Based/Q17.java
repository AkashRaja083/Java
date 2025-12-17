import java.util.*;
public class Q17
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int temp=a;
    int sum=0;
    while(temp>0)
    {
     int b=temp%10 ;
     sum+=b;
     temp/=10;  
    }
    if(a%sum==0)
    {
        System.out.println("Harshad");
    }
    else
    {
        System.out.println("Not Harshad");
    }
   }
}
