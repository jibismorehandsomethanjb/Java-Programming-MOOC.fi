
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        ArrayList<Match> matchInput = readFromFile(fileName);
        System.out.println("Team:");
        String teamInput = scan.nextLine();
        
        ArrayList<Match> matchOfTeam = new ArrayList<>();
        for (Match match : matchInput) {
            if (teamInput.equals(match.getHomeTeam()) || teamInput.equals(match.getVisitingTeam())) {
                matchOfTeam.add(match);
            }
        }

        System.out.println("Games: " + matchOfTeam.size());

        int wins = 0;
        for (Match match : matchOfTeam) {
            if (match.winnerIs(teamInput)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (matchOfTeam.size() - wins));
    }
    
    public static ArrayList<Match> readFromFile(String fileName){
        ArrayList<Match> matchArr = new ArrayList<>();
        try {
            Scanner scan = new Scanner(Paths.get(fileName));
            while (scan.hasNextLine()) {
                String fileRow = scan.nextLine();
                String[] row = fileRow.split(",");
                
                String homeTeam = row[0];
                String visitingTeam = row[1];
                int homeScore = Integer.valueOf(row[2]);
                int visitingScore = Integer.valueOf(row[3]);
                
                matchArr.add(new Match(homeTeam, visitingTeam, homeScore, visitingScore));
            }
                    
        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }
        return matchArr;
    }
}

    