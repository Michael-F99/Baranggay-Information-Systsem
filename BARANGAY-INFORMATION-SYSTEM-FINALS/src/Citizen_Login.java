/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michael
 */
public class Citizen_Login {
    private static int userId;
    private static String username;
    private static String password;

    public static void setUser(int id, String user, String pass) {
        userId = id;
        username = user;
        password = pass;
    }

    public static int getUserId() {
        return userId;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
