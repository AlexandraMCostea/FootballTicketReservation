package football.ticket.Model;

import java.sql.*;
import football.ticket.SqlQuerries;

public class Connection implements SqlQuerries{

private static Connection connection;

	public static Connection getConnection() {
		connection = null;
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/footballticket","root","");

		} catch(Exception e){
		e.printStackTrace();
		}
		return connection;
		}

public static void close(){
		try {
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

		// User

    public void addUser(User newUser) throws ClassNotFoundException, SQLException {
        Connection connection = new Connection();
		PreparedStatement statement = Connection.getConnection().connection.prepareStatement(addNewUser);

        statement.setString(1,newUser.getIDUser());
        statement.setString(2,newUser.getFirstName());
        statement.setString(3,newUser.getLastName());
        statement.setString(4,newUser.getPassword());
        statement.setBoolean(5,newUser.getAdmin());

        int i = statement.executeUpdate();
        System.out.println(i + " records inserted");

        connection.close();
    }

    public void findUserByLastName(String LastName) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();

        PreparedStatement statement = connection.prepareStatement(findUserByLastName);

        statement.setString(1, LastName);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");

            System.out.println();
        }
        connection.close();
    }

    public void findUserByFirstName(String FirstName) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();

        PreparedStatement statement = connection.prepareStatement(findUserByFirstName);

        statement.setString(1, FirstName);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.println();
        }
        connection.close();
    }

    public void deleteUserByFirstName(String FirstName) throws ClassNotFoundException, SQLException {
        Connection connection = new Connection();

        PreparedStatement statement = connection.prepareStatement(deleteUserByFirstName);

        statement.setString(1,FirstName);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

    public void deleteUserByLastName(String LastName) throws ClassNotFoundException, SQLException {
        Connection connection = new Connection();

        PreparedStatement statement = connection.prepareStatement(deleteUserByLastName);

        statement.setString(1,LastName);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

    public void updateUser(String Password, String FirstName) throws ClassNotFoundException, SQLException {
        Connection connection = new Connection();
        PreparedStatement thisStatement = connection.prepareStatement(updateUser);

        thisStatement.setString(1, Password);
        thisStatement.setString(2, FirstName);
        thisStatement.executeUpdate();
    }

    //Reservation

	public void addReservation(Reservations reservations) throws ClassNotFoundException, SQLException {
        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(addNewReservation);

        statement.setString(1,reservations.getIDUser());
        statement.setString(2,reservations.getIDMatch());
        statement.setString(3, String.valueOf(reservations.getIndex()));

        int i = statement.executeUpdate();
        System.out.println(i + " records inserted");

        connection.close();
    }

    public void findReservationByUser(String IDUser) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(findReservationByUser);

        statement.setString(1, IDUser);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.println();
        }
        connection.close();
    }

    public void findReservationByMatch(String IDMatch) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(findReservationByMatch);

        statement.setString(1, IDMatch);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.println();
        }
        connection.close();
    }

    public void deleteReservationByUser(String IDUser) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(deleteReservationByUser);

        statement.setString(1,IDUser);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

    public void deleteReservationByMatch(String IDMatch) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(deleteReservationByMatch);

        statement.setString(1,IDMatch);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

    //Match

	public void addMatch(Matches match) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(addNewMatch);

        statement.setString(1,match.getIDMatch());
        statement.setString(2,match.getTeamHome());
        statement.setString(3,match.getTeamGuest());
        statement.setString(4,match.getStadium());
        statement.setString(5,match.getDateTime());

        int i = statement.executeUpdate();
        System.out.println(i + " records inserted");

        connection.close();
    }

    public void findMatchByTeamHome(String TeamHome) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(findMatchByTeamHome);

        statement.setString(1, TeamHome);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");

            System.out.println();
        }
        connection.close();
    }

    public void findMatchByTeamGuest(String TeamGuest) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(findMatchByTeamGuest);

        statement.setString(1, TeamGuest);

        ResultSet rs = statement.executeQuery();
        while (rs.next()) {
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.println();
        }
        connection.close();
    }

    public void deleteMatchByTeamHome(String TeamHome) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(deleteMatchByTeamHome);

        statement.setString(1,TeamHome);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

    public void deleteMatchByTeamGuest(String TeamGuest) throws ClassNotFoundException, SQLException {

        Connection connection = new Connection();
        PreparedStatement statement = connection.prepareStatement(deleteMatchByTeamGuest);

        statement.setString(1,TeamGuest);

        int i = statement.executeUpdate();

        System.out.println(i + " records deleted");

        connection.close();
    }

	}