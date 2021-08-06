/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Match {
    private String homeTeam;
    private String visitingTeam;
    private int homeScore;
    private int visitingScore;
    
    public Match (String hTeam, String vTeam, int hScore, int vScore) {
        homeTeam = hTeam;
        visitingTeam = vTeam;
        homeScore = hScore;
        visitingScore = vScore;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getVisitingTeam() {
        return visitingTeam;
    }
    
    public int getHomeScore() {
        return homeScore;
    }
    
    public int getVisitingScore() {
        return visitingScore;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(homeTeam) && homeScore > visitingScore) {
            return true;
        } else if (team.equals(visitingTeam) && visitingScore > homeScore) {
            return true;
        } else {
            return false;
        }
    }
}
