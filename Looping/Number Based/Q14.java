import java.util.*;
public class Q14 
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int temp=a;
    int sum=0;
    while(temp>0)
      {
          int b=temp%10;
          int fact=1;
          
          for(int i=1;i<=b;i++)
          {
            fact*=i;
          }
          sum+=fact;
          temp/=10;
      } 
      if(sum==a)
      {
        System.out.println("Strong");
      }
      else
      {
        System.out.println("Not Strong");
      }
   }
}
