import java.util.Scanner;

public class UserInterface {
    private JokeManager jManager;
    private Scanner scanner;

    public UserInterface(JokeManager tJoke, Scanner tScan) {
        this.jManager = tJoke;
        this.scanner = tScan;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            if (input.equalsIgnoreCase("1")) {
                System.out.println("Write the joke to be added:");
                String jokeToAdd = scanner.nextLine();
                jManager.addJoke(jokeToAdd);
            }

            if (input.equalsIgnoreCase("2")) {
                System.out.println(jManager.drawJoke());
            }

            if (input.equalsIgnoreCase("3")) {
                System.out.println("Printing the jokes.");
                jManager.printJokes();
            }
        }
    }
}
