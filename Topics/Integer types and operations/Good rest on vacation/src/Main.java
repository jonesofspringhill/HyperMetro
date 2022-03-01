import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int food_cost_pd = scanner.nextInt();
        int flight_one_way = scanner.nextInt();
        int hotel_per_night = scanner.nextInt();

        int total_cost = duration * food_cost_pd + (duration - 1) * hotel_per_night + 2 * flight_one_way;

        System.out.println(total_cost);
    }
}