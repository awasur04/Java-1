public class Team {
    private String name;
    private int wins;
    private int loses;

    Team(String name) {
        this.name = name;
        this.wins = 0;
        this.loses = 0;
    }

    public String getName() {
        return this.name;
    }
    public int getWins() {
        return this.wins;
    }
    public int getLoses() {
        return this.loses;
    }
    public int getGames() {
        return this.loses + this.wins;
    }

    public void addWin() {
        this.wins++;
    }
    public void addLoss() {
        this.loses++;
    }
}
