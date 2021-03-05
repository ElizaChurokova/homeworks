package servlet.db;

import servlet.model.Submissions;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "0113echste";

    public static Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    public static boolean submit(Submissions submissions){
        String sql = "INSERT INTO submission(submission_login, submission_password, gender)" +
                "VALUES(?, ?, ?)";
        try(Connection connection = connect();
        PreparedStatement stat = connection.prepareStatement(sql)){

            stat.setString(1, submissions.getSubmissionLogin());
            stat.setString(2, submissions.getSubmissionPassword());
            stat.setString(3, submissions.getGender());
            
            stat.executeUpdate();
            return true;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    public List<Submissions> getAllSubmissions(){
        String sql = "SELECT * FROM submissions";
        List<Submissions> result = new ArrayList<>();

        try(Connection connection = connect();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){

        while(rs.next()){
            Submissions subm = new Submissions();
            subm.setSubmissionID(rs.getInt("submission_id"));
            subm.setSubmissionLogin(rs.getString("submission_login"));
            subm.setSubmissionPassword(rs.getString("submission_password"));
            subm.setGender(rs.getString("gender"));
           result.add(subm);
        }
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
