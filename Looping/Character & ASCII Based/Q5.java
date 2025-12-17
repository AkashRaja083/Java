
import java.util.*;
public class Q5
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    // char ch=Character.isLowerCase(s.charAt(0));
    for(int i=0;i<s.length();i++)
        //    char ch=Character.toLowerCase(s.charAt(i));
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.print("vowels:"+ch+" ");
            }
            else
            {
                System.out.print("consonants:"+ch+" ");

            }
        }

  }    
}
