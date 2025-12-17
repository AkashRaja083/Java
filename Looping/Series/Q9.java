/*
Q9. Write a java program to calculate sum of even and odd numbers till N.
*/

import java.util.Scanner;

public class Q9 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int even = 0;
    int odd = 0;
    for(int i=1;i<=n;i++){
        if(i%2 == 0){
            even++;
        }
        else{
            odd++;
        }
    }
    System.out.printf("Sum of Even is : %d\nSum of Odd is : %d ",even,odd);
    sc.close();
  }  
}
