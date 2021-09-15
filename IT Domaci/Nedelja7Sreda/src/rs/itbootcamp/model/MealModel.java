package rs.itbootcamp.model;

public class MealModel {
    private int mealId;
    private String mealName, mealDesc, mealDifficulty;

    public MealModel(int mealId, String mealName, String mealDesc, String mealDifficulty) {
        this.mealId = mealId;
        this.mealName = mealName;
        this.mealDesc = mealDesc;
        this.mealDifficulty = mealDifficulty;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealDesc() {
        return mealDesc;
    }

    public void setMealDesc(String mealDesc) {
        this.mealDesc = mealDesc;
    }

    public String getMealDifficulty() {
        return mealDifficulty;
    }

    public void setMealDifficulty(String mealDifficulty) {
        this.mealDifficulty = mealDifficulty;
    }

    @Override
    public String toString() {
        return "MealModel{" +
                "mealId=" + mealId +
                ", mealName='" + mealName + '\'' +
                ", mealDesc='" + mealDesc + '\'' +
                ", mealDifficulty='" + mealDifficulty + '\'' +
                '}';
    }
}
