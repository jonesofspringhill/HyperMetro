public class Overload {
    public static void method(int i) {
        System.out.println("Int: " + i);
    }

    public static int method(int y, int z) {
        System.out.println("Int: " + y);

        return y+1;
    }

    public static long method(long l) {
        System.out.println("Long: " + l);
        return l+1;
    }

    public static long method(String msg, long l) {
        System.out.println(msg + l);
        return l+1;
    }

    public static void  main (String[] args) {
        long arg = 3L;
        String msg = "Howdy! ";

        System.out.println(method(msg, arg));
    }
}
