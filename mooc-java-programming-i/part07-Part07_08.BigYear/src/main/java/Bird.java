public class Bird {
    private String name;
    private String nameInLatin;
    private int observations;

    public Bird(String tName, String tNameInLatin) {
        this.name = tName;
        this.nameInLatin = tNameInLatin;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public void addObservation() {
        this.observations++;
    }

    public String toString() {
        return this.name + "(" + this.nameInLatin + "): " + this.observations + " observations";
    }
}
