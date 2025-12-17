  
import java.util.*;
public class Q6
{
  public static void main(String[] args) 
      {
          Scanner rs=new Scanner(System.in);
          int js=rs.nextInt();
          int js1=js;
          int rev=0;
          while(js1>0)
          {
            int js2=js1%10;
            rev=rev*10+js2;
            js1/=10;
          }
          System.out.println(rev);
          if(js==rev)
          {
            System.out.println("palindrome");
          }
          else
          {
            System.out.println("Not palindrome");
          }
      }
  
}
