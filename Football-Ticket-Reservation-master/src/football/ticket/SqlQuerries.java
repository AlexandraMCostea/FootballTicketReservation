package football.ticket;

public interface SqlQuerries {
    //User
    String addNewUser="INSERT INTO User (ID, FirstName, LastName, Password, Admin)" + "VALUES (?, ?, ? , ? , ? )";

    String findUserByFirstName="SELECT * FROM User WHERE  FirstName = ?";

    String findUserByLastName="SELECT * FROM User WHERE  LastName = ?";

    String deleteUserByFirstName="DELETE FROM User WHERE FirstName = ?";

    String deleteUserByLastName="DELETE FROM User WHERE LastName = ?";

    String updateUser = "UPDATE User SET password = ? WHERE FirstName = ?";

    //Matches
    String addNewMatch = "INSERT INTO Matches (TeamHome, TeamGuest, Stadium, DateTime)" + "VALUES (?, ?, ?, ?)";

    String findMatchByTeamHome="SELECT * FROM Matches WHERE  TeamHome = ?";

    String findMatchByTeamGuest="SELECT * FROM Matches WHERE  TeamGuest = ?";

    String deleteMatchByTeamHome="DELETE FROM Matches WHERE TeamHome = ?";

    String deleteMatchByTeamGuest="DELETE FROM Matches WHERE TeamGuest = ?";

    //Reservations
    String addNewReservation="INSERT INTO Reservations ( User, Match)" + "VALUES (?, ?)";

    String findReservationByUser="SELECT * FROM User WHERE  User = ?";

    String findReservationByMatch="SELECT * FROM User WHERE  Match = ?";

    String deleteReservationByUser="DELETE FROM User WHERE User = ?";

    String deleteReservationByMatch="DELETE FROM User WHERE Match = ?";

}