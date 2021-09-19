package rs.itbootcamp.dao;

import rs.itbootcamp.database.DatabaseConnection;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.FridgeModel;

import java.sql.Connection;
import java.util.List;

public interface FridgeDao {
    void add(FridgeModel f);
    void delete(int id);
    void update(FridgeModel f);
    FridgeModel getFridge(FridgeModel f);
    List<FoodModel> getAllFood(int id);
    static Connection conn = DatabaseConnection.getConnection();
}