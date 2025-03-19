/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ioc.daw.user;

import java.sql.Timestamp;

/**
 *
 * @author victor
 */
public class User {
private int userId;
private String username;
private String name;
private String email;
private int rank;
private Timestamp createdOn;
private boolean active;
 
public User(int userId, String username, String name, String email, int rank, Timestamp createdOn, boolean active) {
this.userId = userId;
this.username = username;
this.name = name;
this.email = email;
this.rank = rank;
this.createdOn = createdOn;
this.active = active;
}
 
public int getUserId() {
return userId;
}
 
public String getUsername() {
return username;
}
 
public String getName() {
return name;
}
 
public String getEmail() {
return email;
}
 
public int getRank() {
return rank;
}
 
public Timestamp getCreatedOn() {
return createdOn;
}
 
public boolean isActive() {
return active;
}
}
