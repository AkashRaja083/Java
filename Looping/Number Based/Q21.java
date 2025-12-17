import java.util.*;
public class Q21
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n%3==0)
    {
        n/=3;
    }
    if(n==1)
    {
        System.out.println("Power");
    }
    else
    {
       System.out.println("Not Power");
    }
  }    
}
