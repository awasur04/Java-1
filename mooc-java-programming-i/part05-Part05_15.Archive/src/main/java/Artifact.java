public class Artifact {
    private String id;
    private String name;

    public Artifact(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return this.id + ": " + this.name;
    }
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Artifact)) {
            return false;
        }

        Artifact comparedArtifact = (Artifact) compared;
        if (this.id.equals(comparedArtifact.id)) {
            return true;
        }
        return false;
    }
}
