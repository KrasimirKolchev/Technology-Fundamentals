package A_Overview;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int i = 0; n > counter; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
