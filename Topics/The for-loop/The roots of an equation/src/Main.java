import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int degree = 3;
        int rootsFound = 0;

        int[] coeffs = new int[degree+1];
        //int[] coeffs = {1, 1, 1, 1};
        int result;

        for (int i = 0; i <= degree; i++){
            coeffs[i] = scanner.nextInt();
        }

        for (int x = 0; x <= 1000; x++) {
            result = coeffs[0] * (int)Math.pow(x, 3) + coeffs[1] * (int)Math.pow(x, 2) + coeffs[2] * x + coeffs[3];
            if (result == 0) {
                 System.out.println(x);
                 if (++rootsFound >= degree) {
                     break;
                 }
            }
        }
    }
}