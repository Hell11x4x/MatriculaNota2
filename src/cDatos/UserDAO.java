package cDatos;

import Entidad.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UserDAO {
    private static final String USERS_FILE = "users.txt";

    public UserDAO() {}

    public boolean saveUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
            writer.write(user.getUsername() + "," + user.getEmail() + "," + user.getPassword() + "\n");
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public User getUserByUsername(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine())!= null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username)) {
                    return new User(parts[0], parts[1], parts[2]);
                }
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }
    
    public User getUserByEmail(String email) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[1].equals(email)) { // Asume que el correo electrónico es el segundo campo en tu archivo
                    return new User(parts[0], parts[1], parts[2]);
                }
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

}