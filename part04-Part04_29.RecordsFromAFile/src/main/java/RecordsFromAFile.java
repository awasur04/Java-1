
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] pieces = line.split(",");
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                System.out.println(name + ", age: " + age + " years");
            }
        }   catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
