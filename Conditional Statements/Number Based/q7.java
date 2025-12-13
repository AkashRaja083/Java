import java.util.Scanner;
public class q7
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         if(a<b && a<c){
            System.out.println(a+ " is a lesser");
         }
         else if (b<c){
            System.out.println(b + " is a lesser");
         }
         else
         {
            System.out.println(c + " is a lesser");
         }
    } 
}