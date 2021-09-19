package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.FridgeModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FridgeDaoSQL implements FridgeDao{
    @Override
    public void add(FridgeModel f) {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO fridge (fridge_id, user_id) VALUES (?, ?)");

            st.setInt(1, f.getFridgeId());
            st.setInt(2, f.getUserId());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM fridge WHERE fridge_id = ?");

            st.setInt(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(FridgeModel f) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE fridge SET user_id = ? WHERE fridge_id = ?");

            st.setInt(1, f.getUserId());
            st.setInt(2, f.getFridgeId());

            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FridgeModel getFridge(FridgeModel f) {
        return null;
    }

    @Override
    public List<FoodModel> getAllFood(int id) {
        List<FoodModel> res = new ArrayList<>();

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT f.* FROM food f INNER JOIN fridgefood ff ON ff.food_id = f.food_id WHERE fridge_id = " + id);

            while (rs.next())
                res.add(new FoodModel(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5), rs.getDouble(6)));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }
}