import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary sDict) {
        this.scanner = scanner;
        this.dict = sDict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String word = scanner.nextLine();

            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (word.contains("add")) {
                addWord();
                continue;
            }

            if (word.contains("search")) {
                searchWord();
                continue;
            }

            System.out.println("Unknown command");
        }
    }

    public void addWord() {
        System.out.println("Word:");
        String word = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();
        this.dict.add(word, translation);
    }

    public void searchWord() {
        System.out.println("To be translated:");
        String word = scanner.nextLine();
        String translation = dict.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }

}
