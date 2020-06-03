
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Artifact> inventory = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String idInput = scanner.nextLine();
            if (idInput.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                break;
            }
            Artifact newArtifact = new Artifact(idInput, nameInput);
            if (!inventory.contains(newArtifact)) {
                inventory.add(newArtifact);
            }

        }
        for (Artifact item : inventory) {
            System.out.println(item);
        }

    }
}
