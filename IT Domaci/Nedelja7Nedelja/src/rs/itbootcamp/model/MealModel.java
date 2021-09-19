package rs.itbootcamp.model;

public class MealModel {
    private int meal_id;
    private String meal_name, meal_desc, meal_difficulty;

    public MealModel(int meal_id, String meal_name, String meal_desc, String meal_difficulty) {
        this.meal_id = meal_id;
        this.meal_name = meal_name;
        this.meal_desc = meal_desc;
        this.meal_difficulty = meal_difficulty;
    }

    public int getMeal_id() {
        return meal_id;
    }

    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    public String getMeal_name() {
        return meal_name;
    }

    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    public String getMeal_desc() {
        return meal_desc;
    }

    public void setMeal_desc(String meal_desc) {
        this.meal_desc = meal_desc;
    }

    public String getMeal_difficulty() {
        return meal_difficulty;
    }

    public void setMeal_difficulty(String meal_difficulty) {
        this.meal_difficulty = meal_difficulty;
    }

    @Override
    public String toString() {
        return "\n{ " +
                "meal_id=" + meal_id +
                " | meal_name='" + meal_name + '\'' +
                " | meal_desc='" + meal_desc + '\'' +
                " | meal_difficulty='" + meal_difficulty + '\'' +
                " }";
    }
}