import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gradebook gradebook = new Gradebook();
        System.out.println("Enter point totals, -1 stops:");

        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            gradebook.addGrade(input);
        }
        System.out.println("Point average (all): " + gradebook.getAverage());
        System.out.println("Point average (passing): " + gradebook.getPassingAverage());
        System.out.println("Pass percentage: " + gradebook.getPassPercentage());
        gradebook.printDistribution();
    }
}
