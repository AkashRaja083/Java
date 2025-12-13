import java.util.Scanner;
public class q11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int sum = a / 100;
        System.out.println(sum);
        if((sum & 1 )==0)
        {
            System.out.println(sum +" is even");
        }
        else{
            System.out.println(sum + " is odd");
        }
    }
}