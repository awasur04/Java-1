public class Cube {
    private int length;

    public Cube(int edgeLength) {
        this.length = edgeLength;
    }

    public int volume() {
        return length * length * length;
    }
    public String toString() {
        return "The length of the edge is " + this.length + " and the volume is " + this.volume();
    }
}
