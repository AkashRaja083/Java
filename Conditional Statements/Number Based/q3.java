import java.util.Scanner;
public class q3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double n = sc.nextDouble();
        if( n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.println();
    }
}