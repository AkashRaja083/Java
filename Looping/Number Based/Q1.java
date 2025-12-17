
import java.util.*;
public class Q1
 {
    public static void main(String[] args) 
    {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        int fact=1;
        for(int i=1;i<=js;i++)
        {
            fact*=i;
            System.out.print(fact+" ");
        }

    }
}
