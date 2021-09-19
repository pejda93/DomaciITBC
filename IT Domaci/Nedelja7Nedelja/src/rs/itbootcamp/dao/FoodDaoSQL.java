package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;

import javax.swing.plaf.nimbus.State;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodDaoSQL implements FoodDao {
    @Override
    public void add(FoodModel fm) {
        String query = "INSERT INTO food (food_id, food_name, food_kcal, food_proteins, food_carbs, food_fat) " +
                "VALUES (?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, fm.getFood_id());
            st.setString(2, fm.getFood_name());
            st.setDouble(3, fm.getFood_kcal());
            st.setDouble(4, fm.getFood_proteins());
            st.setDouble(5, fm.getFood_carbohydrates());
            st.setDouble(6, fm.getFood_fat());

            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addToMeal(int meal_id, int food_id, double mass) {
        String query = "INSERT INTO mealfood (meal_id, food_id, mass) VALUES (?, ?, ?);";
        try {
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, meal_id);
            st.setInt(2, food_id);
            st.setDouble(3, mass);

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addToFridge(int fridge_id, int food_id, double mass) {
        String query = "INSERT INTO fridgefood (fridge_id, food_id, mass) VALUES (?, ?, ?) " +
                "ON CONFLICT (fridge_id, food_id) DO UPDATE SET mass = ?;";
        try {
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, fridge_id);
            st.setInt(2, food_id);
            st.setDouble(3, mass);
            st.setDouble(4, mass);

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM food WHERE food_id = ?";
        try {
            PreparedStatement st = conn.prepareStatement(query);

            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(FoodModel fm) {
        String query = "UPDATE food SET food_name = ?, food_kcal = ?, food_proteins = ?, food_carbs = ?, food_fat = ? " +
                "WHERE food_id = ?";
        try {
            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1, fm.getFood_name());
            st.setDouble(2, fm.getFood_kcal());
            st.setDouble(3, fm.getFood_proteins());
            st.setDouble(4, fm.getFood_carbohydrates());
            st.setDouble(5, fm.getFood_fat());
            st.setInt(6, fm.getFood_id());

            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FoodModel getFood(int id) {
        try {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM food WHERE food_id = " + id);

            if (rs.next())
                return new FoodModel(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodModel> getAllFood() {
        List<FoodModel> list = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food ORDER BY food_id");

            while (rs.next())
                list.add(new FoodModel(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6)));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}