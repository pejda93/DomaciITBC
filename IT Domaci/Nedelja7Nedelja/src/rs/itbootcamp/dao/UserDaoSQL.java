package rs.itbootcamp.dao;

import rs.itbootcamp.model.UserModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoSQL implements UserDao{
    @Override
    public void add(UserModel user) {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO users (user_id, username, email, user_password, " +
                    "user_admin) VALUES (?, ?, ?, ?, ?)");

            st.setInt(1, user.getUserId());
            st.setString(2, user.getUserName());
            st.setString(3, user.getEmail());
            st.setString(4, user.getPassword());
            st.setBoolean(5, user.isAdmin());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM users WHERE user_id = ?");

            st.setInt(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(UserModel user) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE users SET username = ?, email = ?, user_password = ?, " +
                    "user_admin = ? WHERE user_id = ?");

            st.setString(1, user.getUserName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getPassword());
            st.setBoolean(4, user.isAdmin());
            st.setInt(5, user.getUserId());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public UserModel getUser(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users WHERE user_id = " + id);

            if (rs.next())
                return new UserModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<UserModel> getAllUsers() {
        List<UserModel> users = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users");

            while (rs.next())
                users.add(new UserModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5)));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public void addMealGrade(int user_id, int meal_id, int grade) {

    }

    @Override
    public boolean login(String entry, String password) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT user_password FROM users " +
                    "WHERE username = '" + entry + "' OR email = '" + entry + "';");
            if (rs.next() && rs.getString(1).equals(password)){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}