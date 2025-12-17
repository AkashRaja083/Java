import java.util.Scanner;

public class Q7
{
    public static void main(String[] args) 
      {
          Scanner rs=new Scanner(System.in);
          int js=rs.nextInt();
          int jsrs=Integer.toString(js).length();
          int js1=js;
          int jesu=0;
          while(js1>0)
          {
            int js2=js1%10;
             jesu+=Math.pow(js2,jsrs);
            js1/=10;
          }
          System.out.println(jesu);
          if(js==jesu)
          {
            System.out.println("Armstrong number");
          }
          else
          {
            System.out.println("Not  Armstrong number");
          }
      }
}
