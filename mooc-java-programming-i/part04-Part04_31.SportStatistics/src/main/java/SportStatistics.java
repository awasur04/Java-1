
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Team> teams = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {

                String line = reader.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] pieces = line.split(",");
                String team1Name = pieces[0];
                String team2Name = pieces[1];
                int team1Score = Integer.valueOf(pieces[2]);
                int team2Score = Integer.valueOf(pieces[3]);

                if (!ifTeamExists(team1Name, teams)) {
                    teams.add(new Team(team1Name));
                }
                if (!ifTeamExists(team2Name, teams)) {
                    teams.add(new Team(team2Name));
                }

                if (team1Score > team2Score) {
                    addOutcome(team1Name, team2Name, teams);
                } else {
                    addOutcome(team2Name, team1Name, teams);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (!ifTeamExists(team, teams)) {
            System.out.println("Games: 0");
            System.out.println("Wins: 0");
            System.out.println("Losses: 0");
        } else {
            for (Team each : teams) {
                if (each.getName().equals(team)) {
                    System.out.println("Games: " + each.getGames());
                    System.out.println("Wins: " + each.getWins());
                    System.out.println("Losses: " + each.getLoses());
                }
            }
        }

    }

    public static boolean ifTeamExists(String newTeamName, ArrayList<Team> teams) {
        for (Team aTeam: teams) {
            if (aTeam.getName().equals(newTeamName)) {
                return true;
            }
        }
        return false;
    }
    public static void addOutcome(String winningTeam, String lossingTeam, ArrayList<Team> teams) {
        for (Team aTeam: teams) {
            if (aTeam.getName().equals(winningTeam)) {
                aTeam.addWin();
            }
            if (aTeam.getName().equals(lossingTeam)) {
                aTeam.addLoss();
            }
        }
    }

}
