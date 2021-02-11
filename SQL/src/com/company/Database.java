package com.company;

import java.sql.*;

public class Database {
    private static final String url = "jdbc:postgreasql://localhost:5432/postgres";
private static final String user = "postgres";
    private static final String password = "0113echste";

    public static Connection connect(){
        Connection conn = null;
        try{
            conn= DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully");

    }catch (
    SQLException ex){
        System.out.println(ex.getMessage());
    }
    return conn;
}
public static int getAStudentsCount(){
        String sql = "select count(*) fron studeents " + "WHERE LOWER (student_full_name) LIKE '%a%'";
        int count = 0;

        try(Connection conn = connect();
        Statement stmt = connect().createStatement();
        ResultSet rs = stmt.executeQuery(sql);){
        rs.next();
        count = rs.getInt("count");

    }
    catch (SQLException ex){
        System.out.println(ex.getMessage());
    }
    return count;
}

public static void printGroups(){
        String sql = "select * from groups";
        try(Connection conn = connect();
            Statement stmt = conn.createStatement ();
            ResultSet rs = stmt.executeQuery(sql);){
            while(rs.next()){
                System.out.println(rs.getString(1) + ": " +
                        rs.getString(2));
            }
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
}

public int getTrainersCount(){
    String sql = "SELECT COUNT(*) FROM Trainers";
    int count = 0;

    try (Connection conn = connect();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);){
    rs.next();
    count = rs.getInt(1);

    }
    catch (SQLException ex){
        System.out.println(ex.getMessage());
    }
    //return count;
}
public static boolean insertCountry(int id, String name, int countryCode, int countryPopulation)
String sql = "isert into countries(id, name, country_code, country_population"
        "values(2, 2, 2, 2)";
int result = 0;
try(Connection conn = connect();
    PreparedStatement stmt = conn.preparedStatement(sql)){
    stmt.setString(1, id);
    stmt.setString(2, name);
    stmt.setInt(3, countryCode);
    stmt.setInt(4, countryPopulation);

    result = stmt.executeUpdate();

}
catch (SQLExceptionption ex){
        System.out.println(ex.getMessage());

    }
    return result > 0;
}
public static boolean insertCity(int id, String name, int countryId, int cityPopulation, ...)
String sql = "INSERT INTO cities(id, name, country_id, city_population)" +
        "values(?, ?, ?, ?)";
int result =0;
try(Connection conn = connect();
PreparedStatement stmt = conn.prepareStatement(sql)){

    stmt.setInt(1, id);
    stmt.setString(2, name);
    stmt.setInt(3, countryId);
    stmt.setInt(4, cityPopulation);

    result = stmt
        }


public static List<City> getCitiesWithCountries(){
    String sql = "select * from cities c" +
        "join countries cn on cn.id = c.country_id";
List<Citt> cities = new ArrayList<>();

    try(Connection conn = connect();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql)){

        while(rs.next()){
        Country country
        }
        //
        public static List<City> getCitiesLength(int length){
            String sql = "SELECT * FROM CITIES WHERE LENGTH(city_name) > ? ";
            //
        List<City>cities = new ArrayList();
        Preparedstatement stmt = conn.preparedStatement(sql)){
    stmt.setInt(1, length);
    ResultSet rs = stmt.executeQuery();

    while(rs.next)
        }
        }
        }
        }
