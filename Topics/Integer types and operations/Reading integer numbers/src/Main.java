import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIp = 4;
        int[] numbers = new int[numIp];

        for (int i = 0; i < numIp; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}