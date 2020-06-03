import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.items.size() == 0) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.items.add(value);
    }

    public ArrayList<String> values() {
        return this.items;
    }

    public String take() {
        int index = this.items.size()-1;
        String last = items.get(index);
        items.remove(index);
        return last;
    }
}
