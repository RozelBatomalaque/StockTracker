


package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectDB {
    private Connection connect;

       // constructor to connect to our database
        public connectDB(){
            try{
                connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tracker", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }//Function to save data
        public int insertData(String sql){
            int result;
            try{
                PreparedStatement pst = (PreparedStatement) connect.prepareStatement(sql);
                pst.executeUpdate();
                System.out.println("Inserted Successfully!");
                pst.close();
                result =1;
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
                result =0;
            }
            return result;
        }//Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        } 
        public boolean fieldExists(String fieldName, String value) throws SQLException {
        String sql = "SELECT * FROM `users` WHERE  " + fieldName + " = ?";
        PreparedStatement pstmt = (PreparedStatement) connect.prepareStatement(sql);
        pstmt.setString(1, value);
        ResultSet result = pstmt.executeQuery();

        return result.next(); 
        }
        public String validateLogin(String username, String password) throws SQLException {
    String sql = "SELECT usertype FROM users WHERE username = ? AND password = ?";
    String userType = null;

    try (PreparedStatement pst = connect.prepareStatement(sql)) {
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            userType = rs.getString("usertype"); // Get user type from database
        }

        rs.close();
    } catch (SQLException ex) {
        System.out.println("Login Error: " + ex);
    }

    return userType; // Returns null if no user is found
}

    
}

