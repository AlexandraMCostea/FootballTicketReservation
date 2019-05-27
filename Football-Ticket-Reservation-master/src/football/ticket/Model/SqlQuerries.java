package football.ticket.Model;

public interface SqlQuerries {
    //User
    String addNewUser="INSERT INTO User ( firstname, lastname, password, admin)" + "VALUES (?, ? , ? , ? )";

    String findUserByFirstName="SELECT * FROM User WHERE  firstname = ?";

    String findUserByLastName="SELECT * FROM User WHERE  lastname = ?";

    String deleteUserByFirstName="DELETE FROM User WHERE firstname = ?";

    String deleteUserByLastName="DELETE FROM User WHERE firstname = ?";

    String updateUser = "UPDATE User SET password = ? WHERE firstname = ?";

    //Matches
    String addNewMatch = "INSERT INTO matches (host, guest, stadium, date)" + "VALUES (?, ?, ?, ?)";

    String findMatchByTeamHome="SELECT * FROM Matches WHERE  TeamHome = ?";

    String findMatchByTeamGuest="SELECT * FROM Matches WHERE  TeamGuest = ?";

    String deleteMatchByTeamHome="DELETE FROM Matches WHERE teamHome = ?";

    String deleteMatchByTeamGuest="DELETE FROM Matches WHERE TeamGuest = ?";

    //Reservations
    String addNewReservation="INSERT INTO Reservations ( user, match)" + "VALUES (?, ?)";

    String findReservationByUser="SELECT * FROM User WHERE  User = ?";

    String findReservationByMatch="SELECT * FROM User WHERE  Match = ?";

    String deleteReservationByUser="DELETE FROM User WHERE User = ?";

    String deleteReservationByMatch="DELETE FROM User WHERE Match = ?";

}