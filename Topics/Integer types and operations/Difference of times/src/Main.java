import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hr1, mn1, sc1;
        int hr2, mn2, sc2;
        int time_delta_sec;

        hr1 = scanner.nextInt();
        mn1 = scanner.nextInt();
        sc1 = scanner.nextInt();

        hr2 = scanner.nextInt();
        mn2 = scanner.nextInt();
        sc2 = scanner.nextInt();

        time_delta_sec = (60*(mn2 + 60 * hr2) + sc2) - (60*(mn1 + 60 * hr1) + sc1);
        
        System.out.println(time_delta_sec);
    }
}