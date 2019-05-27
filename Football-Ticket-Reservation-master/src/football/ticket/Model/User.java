package football.ticket.Model;

import football.ticket.SqlQuerries;

import java.sql.*;

public class User implements SqlQuerries {

    private String IDUser;
    private String FirstName;
    private String LastName;
    private String Password;
    private Boolean Admin;

    public String getIDUser() { return IDUser; }

    public void setIDUser(String IDUser) { this.IDUser = IDUser; }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public Boolean getAdmin() {
        return Admin;
    }

    public void setAdmin(Boolean admin) {
        this.Admin = admin;
    }

    public User(String iduser, String firstname, String lastname, String password, Boolean admin) {
        this.IDUser = iduser;
        this.FirstName = firstname;
        this.LastName = lastname;
        this.Password = password;
        this.Admin = admin;
    }

}
