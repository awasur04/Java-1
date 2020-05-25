
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int amount = Integer.valueOf(scan.nextLine());
        double tax = 0;

        if (amount < 5000) {
            tax = 0;
        } else if (amount >= 5000 && amount < 25000) {
            tax = (100 + (amount - 5000) * 0.08);
        } else if (amount >= 25000 && amount < 55000) {
            tax = (1700 + (amount - 25000) * 0.1);
        } else if (amount >= 55000 && amount < 200000) {
            tax = (4700 + (amount - 55000) * .12);
        } else if (amount >= 200000 && amount < 1000000) {
            tax = (22100 + (amount - 200000) * .15);
        } else {
            tax = (142100 + (amount - 1000000) * .17);
        }

        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.printf("Tax: " + tax);
        }
    }
}
