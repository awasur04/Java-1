
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ending = "no";
        while (true) {
            System.out.println("Carry on?");
            String answer = scanner.nextLine();

            if (answer.equals(ending)) {
                break;
            }
        }
    }
}