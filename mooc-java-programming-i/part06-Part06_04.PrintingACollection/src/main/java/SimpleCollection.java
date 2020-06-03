
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String tempString = "";
        for (String element : this.elements) {
            tempString = tempString  + "\n" + element;
        }
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        } else if (this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:" + tempString;
        } else {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + tempString;
        }
    }
    
}
