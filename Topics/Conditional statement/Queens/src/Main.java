import java.util.Scanner;

class Main {
    public static boolean canCapture(int x1, int y1, int x2, int y2) {
        if ((x1 == x2) || (y1 == y2)) {
            // they are on the same row or column
            return true;
        } else if (Math.abs(x1-x2) == Math.abs(y1-y2)){
            // They are on the same diagonal
            return true;
        } else {
            // They aren't
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int rQCol = scanner.nextInt();
        int rQRow = scanner.nextInt();
        int wQCol = scanner.nextInt();
        int wQRow = scanner.nextInt();

        if (canCapture(rQCol, rQRow, wQCol, wQRow)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}