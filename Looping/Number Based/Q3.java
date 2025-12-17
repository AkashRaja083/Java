import java.util.*;
public class Q3
{
  public static void main(String[] args) 
  {
    Scanner rs=new Scanner(System.in);
    int js=rs.nextInt();
    int js1 = Integer.toString(js).length();

    int count=0;
    for(int i=0;i<js1;i++)
        {
            js/=10;
            count++;
        }    
        System.out.println(count);
  }    


}
