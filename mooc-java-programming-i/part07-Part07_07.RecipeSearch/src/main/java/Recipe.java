import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String tName, int tCookTime, ArrayList<String> tIngredients) {
        this.name = tName;
        this.cookingTime = tCookTime;
        this.ingredients = new ArrayList<>(tIngredients);
    }

    public String getName() {
        return this.name;
    }

    public int getCookTime() {
        return this.cookingTime;
    }

    public boolean containsIngredient(String search) {
        for (String ingredient : this.ingredients) {
            if (ingredient.equalsIgnoreCase(search)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
