/*
A computer networks student wants to convert bytes into bits. Since 1 byte = 8 bits, the program multiplies accordingly.
Sample Input :
 Bytes: 4
Sample output :
Bits: 32
*/

import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bytes = sc.nextInt();
        int bits = bytes * 8;
        System.out.println("Bits: " + bits);
        sc.close();
    }
}
