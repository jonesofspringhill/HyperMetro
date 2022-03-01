import java.util.*;

public class Main {

    public static String getDayOfWeekName(int number) {
        // write your code here
        String[] dayArray = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if (number <= 0 || number > 7) {
            throw new IllegalArgumentException("Number out of range 1..7");
        }
        return dayArray[number-1];
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Long val = new Long(4321);

        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}