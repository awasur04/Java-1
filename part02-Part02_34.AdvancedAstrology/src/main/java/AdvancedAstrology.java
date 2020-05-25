
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int spaces = size - 1;
        int stars = size - spaces;

        for (int i = 1; i <= size; i++) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars++;
        }
    }

    public static void christmasTree(int height) {
        int stars = 1;
        int spaces = height-1;
        while (stars >= 0 && spaces >= 0) {
            printSpaces(spaces);
            printStars(stars);
            stars = stars + 2;

            spaces--;
        }
        int counter = 0;
        while (counter < 2) {
            printSpaces(height-2);
            printStars(3);

            counter++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
