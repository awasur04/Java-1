import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    public String drawJoke() {
        if (this.jokes.size() > 0) {
            Random rand = new Random();
            int random = rand.nextInt(this.jokes.size());
            return this.jokes.get(random);
        }
        return "Jokes are in short supply.";
    }
    public void printJokes() {
        if (this.jokes.size() > 0) {
            for (String joke : this.jokes) {
                System.out.println(joke);
            }
        }
    }

}
