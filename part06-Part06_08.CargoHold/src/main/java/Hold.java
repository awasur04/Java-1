import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> trunk;

    public Hold(int max) {
        this.maxWeight = max;
        this.trunk = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight <= (this.maxWeight - suitcase.totalWeight())) {
            this.trunk.add(suitcase);
            this.currentWeight += suitcase.totalWeight();
        }
    }

    public String toString() {
        return this.trunk.size() + " suitcases (" + this.currentWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.trunk) {
            suitcase.printItems();
        }
    }
}
