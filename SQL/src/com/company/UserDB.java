package com.company;

public class UserDB {
    public static boolean addUser(User user){
        String sql = "INSERT INTO users(user_name, email, password, date_of_registration" +
                "VALUES (?, ?, ?, now()";
        int result = 0;
        try(connection conn = Database.connect():
        PreparedSstatement stmt = conn.preparedStatement(sql));
        

    }
}
