
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String fileToRead = scanner.nextLine();

        int lineNumber = 0;
        String name = "";
        int cookTime = 0;
        ArrayList<String> ingredients = new ArrayList<>();
        ArrayList<Recipe> recipeBook = new ArrayList<>();

        try(Scanner scan = new Scanner(Paths.get(fileToRead))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                if (row.isEmpty()) {
                    lineNumber = 0;
                    recipeBook.add(new Recipe(name, cookTime, ingredients));
                    name = "";
                    cookTime = 0;
                    ingredients.clear();
                    continue;
                }
                if (lineNumber == 0) {
                    name = row;
                    lineNumber++;
                    continue;
                } else if (lineNumber == 1) {
                    cookTime = Integer.valueOf(row);
                    lineNumber++;
                    continue;
                } else if (lineNumber > 1) {
                    ingredients.add(row);
                    lineNumber++;
                    continue;
                }
            }
            recipeBook.add(new Recipe(name, cookTime, ingredients));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes bby ingredient");

        while (true) {
            System.out.println("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipeBook) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String input = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipeBook) {
                    if (recipe.getName().contains(input)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int input = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipeBook) {
                    if (recipe.getCookTime() <= input) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String input = scanner.nextLine();
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipeBook) {
                    if (recipe.containsIngredient(input)) {
                        System.out.println(recipe);
                    }
                }
            }

        }

    }

}
