import java.util.*;
public class Q10
{
  public static void main(String[] args)
  {
    Scanner rs= new Scanner(System.in);
    int js=rs.nextInt();
    int count=0;
    for(int i=1;i<=js;i++)
    {
        if(js%i==0)
        {    
         count++;
        }
    }
    if(count==2)
    {
        System.out.println("Prime");
    }
    else
    {
       System.out.println("Not Prime");
    }
  }  
}
