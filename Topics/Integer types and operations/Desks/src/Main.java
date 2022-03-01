import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int classRooms = 3;

        int[] desks = new int[classRooms];
        int totalDesks = 0;

        // declare an array of students per class room
        int[] students = new int[classRooms];

        // get student numbers per class room
        for (int i = 0; i < classRooms; i++) {
            students[i] = scanner.nextInt();
            if (students[i] % 2 == 0) {
                desks[i] = students[i] / 2;
            } else {
                desks[i] = students[i] / 2 + 1;
            }
            totalDesks += desks[i];
        }
        System.out.println(totalDesks);
    }
}