/*
A person drives at a constant speed. Given the speed (km/hr) and time (hr), the program must calculate the distance travelled using: distance = speed × time.
Sample Input:
Speed: 60 Time: 2
Sample OUtpupt:
Distance: 120 km
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed = sc.nextDouble();   // km/hr
        double time = sc.nextDouble();    // hr
        double distance = speed * time;
        System.out.println("Distance: " + distance + " km");
        sc.close();
    }
}
