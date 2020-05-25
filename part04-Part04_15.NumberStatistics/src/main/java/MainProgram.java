
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statsOne = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                statsEven.addNumber(input);
            } else {
                statsOdd.addNumber(input);
            }

            statsOne.addNumber(input);
        }

        System.out.println("Sum: " + statsOne.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
