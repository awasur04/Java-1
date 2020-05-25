import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, pubYear));
        }
        System.out.println("What information will be printed?");
        String selection = scanner.nextLine();

        if (selection.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }  else if (selection.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getName());
            }
        }

    }
}
