import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int subjects = input.nextInt();
        int students = input.nextInt();

        int[][] grades = new int[students][subjects];
        double[] averages = new double[students];

        double total = 0;
        double highest = 0;

        for (int i = 0; i < students; i++) {
            double sum = 0;

            for (int j = 0; j < subjects; j++) {
                grades[i][j] = input.nextInt();
                sum += grades[i][j];
            }

            averages[i] = sum / subjects;
            total += sum;

            if (averages[i] > highest) {
                highest = averages[i];
            }
        }

        System.out.println("Student averages:");

        for (int i = 0; i < students; i++) {
            System.out.println(averages[i]);
        }

        System.out.println();
        System.out.println("Group average:");
        System.out.println(total / (students * subjects));

        System.out.println();
        System.out.println("Highest-performing student:");

        for (int i = 0; i < students; i++) {
            if (averages[i] == highest) {
                System.out.println(i + 1);
            }
        }

        System.out.println();
        System.out.println("Students with at least one grade below 5:");

        boolean found = false;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                if (grades[i][j] < 5) {
                    System.out.println(i + 1);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("None");
        }

        input.close();
    }
}
