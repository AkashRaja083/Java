import java.util.Scanner;
public class q4
{
    public static void main(String []args)
    {
    Scanner sc= new Scanner(System.in);
    int a= sc. nextInt();
    int b = sc.nextInt();
   int  c = (a-b);
   System.out.println(c);
      if(c/2==0){
        System.out.println("The number is Even");
      }
      else{
        System.out.println("The number is odd");
      }
    } 
}