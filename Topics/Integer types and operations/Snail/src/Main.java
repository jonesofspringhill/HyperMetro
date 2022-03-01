import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int h = 0;
        int count = 1;

        do {
            h += A;
            if (h >= H) {
                break;
            } else {
                h -= B;
                count++;
            }
        } while (true);
        System.out.println(count);
    }
}