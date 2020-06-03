
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int numbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input < 0) {
                continue;
            }
            total = total + input;
            numbers = numbers + 1;
        }
        if (numbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)total / numbers);
        }
    }
}
