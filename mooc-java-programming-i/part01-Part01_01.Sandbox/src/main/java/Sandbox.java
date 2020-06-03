import java.util.Random;

public class Sandbox {

    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt(100);

        if (randInt % 2 == 0) {
            System.out.println("Workout");
        } else {
            System.out.println("Chill");
        }

    }
}
