import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList tList, Scanner tScanner) {
        this.list = tList;
        this.scanner = tScanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                addTask();
                continue;
            }

            if (command.equals("list")) {
                list.print();
                continue;
            }

            if (command.equals("remove")) {
                removeTask();
                continue;
            }
        }
    }

    public void addTask() {
        System.out.println("To add:");
        String tAdd = scanner.nextLine();
        this.list.add(tAdd);
    }

    public void removeTask() {
        System.out.println("Which one is removed?");
        int input = Integer.valueOf(scanner.nextLine());
        list.remove(input);
    }
}
