
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int answer = Integer.valueOf(scanner.nextLine());

            if (answer < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (answer == 0) {
                break;
            }
            System.out.println(answer * answer);
        }
    }
}
