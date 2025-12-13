import java.util.Scanner;
public class q13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        if(a>0)
        {
            System.out.println("Number is positive");
        }
        else if (a<0)
            {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println(" The number is zero");
        }
    }
}