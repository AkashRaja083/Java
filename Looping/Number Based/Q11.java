import java.util.*;
public class Q11
{
  public static void main(String[] args) 
      {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        for(int i=1;i<=js;i++)
        {
            if(js%i==0)
            {
                System.out.println(i+" ");
            }
        }
      }
     
}
