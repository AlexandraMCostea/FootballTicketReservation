package football.ticket.Model;

import football.ticket.SqlQuerries;

import java.sql.*;

public class Reservations implements SqlQuerries {
    private String IDUser;
    private String IDMatch;
    private Integer Index;


    public Reservations(String iduser, String idmatch, Integer index) {
        this.IDUser = iduser;
        this.IDMatch = idmatch;
        Index = index;
    }

    public String getIDUser() {
        return IDUser;
    }

    public void setIDUser(String IDUser) {
        this.IDUser = IDUser;
    }

    public String getIDMatch() {
        return IDMatch;
    }

    public void setIDMatch(String IDMatch) {
        this.IDMatch = IDMatch;
    }

    public Integer getIndex() {
        return Index;
    }

    public void setIndex(Integer index) {
        Index = index;
    }
}
