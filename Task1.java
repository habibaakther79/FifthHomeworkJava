import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] radius = new int[n];

        for (int i = 0; i < n; i++) {
            radius[i] = input.nextInt();
        }

        int largest = radius[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (radius[i] > largest) {
                largest = radius[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (radius[i] == largest) {
                count++;
            }
        }

        System.out.println(largest + " - " + count);
    }
}