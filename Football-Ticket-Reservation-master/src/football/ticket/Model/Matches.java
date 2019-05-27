package football.ticket.Model;

import football.ticket.SqlQuerries;

import java.sql.*;

public class Matches implements SqlQuerries {

    private String IDMatch;
    private String TeamHome;
    private String TeamGuest;
    private String Stadium;
    private String DateTime;

    public String getIDMatch() { return IDMatch; }

    public void setIDMatch(String IDMatch) { this.IDMatch = IDMatch; }

    public String getTeamHome() {
        return TeamHome;
    }

    public void setTeamHome(String teamHome) {
        this.TeamHome = teamHome;
    }

    public String getTeamGuest() {
        return TeamGuest;
    }

    public void setTeamGuest(String teamGuest) {
        this.TeamGuest = teamGuest;
    }

    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String stadium) {
        this.Stadium = stadium;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        this.DateTime = dateTime;
    }

    public Matches(String idMatch, String teamHome, String teamGuest, String stadium, String dateTime) {
        IDMatch = idMatch;
        this.TeamHome = teamHome;
        this.TeamGuest = teamGuest;
        this.Stadium = stadium;
        this.DateTime = dateTime;
    }

}
