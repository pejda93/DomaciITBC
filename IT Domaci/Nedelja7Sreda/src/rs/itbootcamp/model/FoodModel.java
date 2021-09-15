package rs.itbootcamp.model;

public class FoodModel {
    private int foodId;
    private String foodName;
    private double foodKcal, foodProteins, foodCarbohydrates, foodFat;

    public FoodModel(int foodId, String foodName, double foodKcal, double foodProteins, double foodCarbohydrates, double foodFat) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodKcal = foodKcal;
        this.foodProteins = foodProteins;
        this.foodCarbohydrates = foodCarbohydrates;
        this.foodFat = foodFat;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodKcal() {
        return foodKcal;
    }

    public void setFoodKcal(double foodKcal) {
        this.foodKcal = foodKcal;
    }

    public double getFoodProteins() {
        return foodProteins;
    }

    public void setFoodProteins(double foodProteins) {
        this.foodProteins = foodProteins;
    }

    public double getFoodCarbohydrates() {
        return foodCarbohydrates;
    }

    public void setFoodCarbohydrates(double foodCarbohydrates) {
        this.foodCarbohydrates = foodCarbohydrates;
    }

    public double getFoodFat() {
        return foodFat;
    }

    public void setFoodFat(double foodFat) {
        this.foodFat = foodFat;
    }

    @Override
    public String toString() {
        return "Naziv: " + foodName + " Kcal: " + foodKcal;
    }
}