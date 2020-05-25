public class Container {
    private int capacity = 0;

    public Container() {}

    public int contains() {
        return this.capacity;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.capacity + amount <= 100) {
                this.capacity += amount;
            } else {
                this.capacity = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.capacity - amount >= 0) {
                this.capacity -= amount;
            } else {
                this.capacity = 0;
            }
        }
    }

    public String toString() {
        return this.capacity + "/100";
    }
}
