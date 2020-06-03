
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        ArrayList<Bird> birdDatabase = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("? ");
            String command = scan.nextLine();
            if (command.equalsIgnoreCase("add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameInLatin = scan.nextLine();
                birdDatabase.add(new Bird(name, nameInLatin));
            } else if (command.equalsIgnoreCase("observation")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                boolean birdFound = false;
                for (Bird bird : birdDatabase) {
                    if (bird.getName().equalsIgnoreCase(name)) {
                        bird.addObservation();
                        birdFound = true;
                    }
                }
                if (!birdFound) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("all")) {
                for (Bird bird : birdDatabase) {
                    System.out.println(bird);
                }
            } else if (command.equalsIgnoreCase("one")) {
                System.out.println("Bird? ");
                String name = scan.nextLine();
                boolean birdFound = false;
                for (Bird bird : birdDatabase) {
                    if (bird.getName().equalsIgnoreCase(name)) {
                        System.out.println(bird);
                        birdFound = true;
                    }
                }
                if (!birdFound) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("Not a command!");
            }
        }

    }

}
