import java.util.*;
public class Q13{
        public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int sqrt=(int)Math.sqrt(a);
    if(sqrt*sqrt==a)
    {
        System.out.println("Perfect");
    
    }
    else
    {
        System.out.println("Not Perfect");
    }
    }

}