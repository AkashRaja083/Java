import java.util.*;
public class Q16
{
   public static void main(String[] args) {
       {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a;
        int sum=0;
        while(b>0)
        {
            int c=b%10;
            sum+=c;
            b/=10;
    
        } 
        if(a==sum)
        {
            System.out.println("Neon");
        }
        else
        {
            System.out.println("Not Neon");
        }
       }
   }   
}
