
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String correct = "Caput Draconis";

        // Write your program here
        System.out.println("Password?");
        String password = scan.nextLine();
        if (password.equals(correct)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
