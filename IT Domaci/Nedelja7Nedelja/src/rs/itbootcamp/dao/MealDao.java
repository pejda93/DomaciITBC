package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;
import rs.itbootcamp.database.DatabaseConnection;

import java.sql.Connection;
import java.util.List;

public interface MealDao {
    void add(MealModel mm);
    void addMealGrade(int user_id,int meal_id, int grade);
    void delete(int id);
    void update(MealModel mm);
    MealModel getMeal(int id);
    List<MealModel> getAllMeals();
    List<String> getAllMealNames();
    List<String> getMealNames(String search);
    List<String> getFoodMealNames(int meal_id);
    List<FoodModel> getFoodMeal(int meal_id); // Сва храна за јело са id = meal_id
    static Connection conn = DatabaseConnection.getConnection();
}