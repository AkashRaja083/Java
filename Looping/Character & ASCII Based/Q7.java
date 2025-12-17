import java.util.*;
public class Q7 
{
  public static void main(String[] args) 
  {
     Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int d=0;
    int c=0;

    while(a>0)
    {
        int b=a%10;
        if(a%b==0)
        {
          d++;
        }
        else if(a%b==1)
        {
          c++;
        }
        a/=10;
         
    }
    System.out.println(d);
        System.out.println(c);
        
  }    
}
