
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    public static int sum(ArrayList<Integer> numbers) {
        int totalSum = 0;
        for (int number: numbers) {
            totalSum += number;
        }
        return totalSum;
    }

}
