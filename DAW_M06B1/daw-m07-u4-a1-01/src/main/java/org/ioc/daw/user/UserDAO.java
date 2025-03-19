/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ioc.daw.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.ioc.daw.db.DBConnection;

/**
 *
 * @author victor
 */
public class UserDAO {
    private DBConnection dBConnection;
    
    public UserDAO(DBConnection dBConnection){
        this.dBConnection = dBConnection;
    }
    public List<User> findAllUsers() {
        String qry = "select user_id, username, name, email, rank, active, created_on from users";
        List<User> users = new ArrayList<>();
        try (
            Connection conn = dBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);) {
            while (rs.next()) {
                int userId = rs.getInt("user_id");
                String username = rs.getString("username");
                String name = rs.getString("name");
                String email = rs.getString("email");
                int rank = rs.getInt("rank");
                boolean active = rs.getBoolean("active");
                Timestamp timestamp = rs.getTimestamp("created_on");
                User user = new User(userId, username, name, email, rank, timestamp, active);
                users.add(user);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        return users;
    }
    public DBConnection getDBConnection(){
        return this.dBConnection;
    }
}