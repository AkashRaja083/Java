import java.util.*;
public class Q4 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    int js=rs.nextInt();
    int product =1;
    for(int i=1;i<js;i++)
    {
        product*=i;
        System.out.println(product+" ");
    }
    // System.out.println(product+" ");
  }    
}
