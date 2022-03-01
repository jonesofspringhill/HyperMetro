class SimpleCalculator {
    // Implement your methods here
    public static void subtractTwoNumbers (long a, long b) {
        System.out.println(a - b);
    }


    public static void sumTwoNumbers(long a, long b) {
        System.out.println(a + b);
    }


    public static void divideTwoNumbers(long a, long b) {
        if ( b == 0) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(a / b);
        }
    }


    public static void multiplyTwoNumbers (long a, long b) {
        System.out.println(a * b);
    }
}

class Main {
    public static int method(int[] array, int... vararg) {
        return 1;
    }

    public static void  main (String[] args) {
        //int[] nums = new int[] {1, 2, 3, 4};
        String n = "Hello";

        System.out.println(n.substring(0, 4));
        //System.out.println(method(new int[] {1, 2, 3}, 4, 5));
    }
}