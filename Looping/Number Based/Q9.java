import java.util.Scanner;

public class Q9
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        while(b!=0)
        {
            int r=a%b;
            a=b;
            b=r;

        }
        System.out.println(a);
   }
 }

