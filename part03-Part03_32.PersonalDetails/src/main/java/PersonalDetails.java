
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sumAge = 0;
        int totalInputs = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            if (pieces[0].length() > longestName.length()) {
                longestName = pieces[0];
            }

            sumAge += Integer.valueOf(pieces[1]);
            totalInputs++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)sumAge / totalInputs));
    }
}
