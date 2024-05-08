
package cNegocio;

import Entidad.User;
import cDatos.UserDAO;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO();
    }

    public boolean authenticate(String email, String password) {
        User user = userDAO.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean register(String username, String email, String password) {
        User user = new User(username, email, password);
        return userDAO.saveUser(user);
    }

    public User getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }
    public boolean saveUser(User user) {
        return userDAO.saveUser(user);
    }

}