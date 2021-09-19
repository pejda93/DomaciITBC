package rs.itbootcamp.dao;

import rs.itbootcamp.database.DatabaseConnection;
import rs.itbootcamp.model.UserModel;

import java.sql.Connection;
import java.util.List;

public interface UserDao {
    void add(UserModel user);
    void delete(int id);
    void update(UserModel user);
    UserModel getUser(int id);
    List<UserModel> getAllUsers();
    void addMealGrade(int user_id, int meal_id, int grade);
    boolean login(String entry, String password);
    static Connection conn = DatabaseConnection.getConnection();
}