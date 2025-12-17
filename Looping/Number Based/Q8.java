import java.util.*; 
public class Q8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(y!=0)
        {
            int r=x%y;
            x=y;
            y=r;
        }
        int gcd=x;
        int lcm=a*b/gcd;
        System.out.println(lcm);
    }
}
