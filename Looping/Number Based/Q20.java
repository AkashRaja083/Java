import java.util.*;
public class Q20 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int temp=n;
     while(n>9)
        {

     int sum=0;
     while(temp>0)
        {
            int d=temp%10;
            sum+=d;
            temp/=10;
        }   
        temp=sum;
        }
        if(temp==1)
        {
            System.out.println("Magic");
        }
        else
        {
           System.out.println("Not Magic");
        
        }
  }
}
