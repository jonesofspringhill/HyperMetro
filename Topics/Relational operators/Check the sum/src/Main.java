import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean result = false;
        int numIp = 3;
        int target = 20;

        Scanner scanner = new Scanner(System.in);

        // put your code here
        int[] numbers = new int[numIp];
        for (int i = 0; i < numIp; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numIp-1; i++) {
            for (int j = i+1; j < numIp; j++) {
                result = result || (numbers[i] + numbers[j] == target);
            }
        }
        System.out.println(result);
    }
}