
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int totalInputs = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (input % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            totalSum += input;
            totalInputs += 1;
        }
        System.out.println("Sum: " + totalSum);
        System.out.println("Numbers: " + totalInputs);
        System.out.println("Average: " + ((double)totalSum / (double)totalInputs));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
