import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> inventory;
    private int maxWeight;
    private int currentWeight = 0;

    public Suitcase(int max) {
        inventory = new ArrayList<>();
        this.maxWeight = max;
    }

    public void addItem(Item item) {
        if (this.currentWeight <= (this.maxWeight - item.getWeight())) {
            this.inventory.add(item);
            this.currentWeight += item.getWeight();
        }

    }

    public String toString() {
        if (this.inventory.size() == 0) {
            return "no items (0 kg)";
        } else if (this.inventory.size() == 1) {
            return "1 item (" + this.currentWeight + " kg)";
        } else {
            return this.inventory.size() + " items (" + this.currentWeight + " kg)";
        }
    }

    public void printItems() {
        for (Item item : this.inventory) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        return this.currentWeight;
    }

    public Item heaviestItem() {
        if (this.inventory.size() == 0) {
            return null;
        }

        Item returnItem = this.inventory.get(0);

        for (Item i : this.inventory) {
            if (i.getWeight() > returnItem.getWeight()) {
                returnItem = i;
            }
        }
        return returnItem;
    }
}
