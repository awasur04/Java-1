
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String selection = scanner.nextLine();
        System.out.println(selection + selection + selection);

    }
}
