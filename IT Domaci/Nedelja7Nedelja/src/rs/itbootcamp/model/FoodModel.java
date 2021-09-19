package rs.itbootcamp.model;

public class FoodModel {
    private int food_id;
    private String food_name;
    private double food_kcal, food_proteins, food_carbohydrates, food_fat;

    public FoodModel(int food_id, String food_name, double food_kcal, double food_proteins, double food_carbohydrates, double food_fat) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.food_kcal = food_kcal;
        this.food_proteins = food_proteins;
        this.food_carbohydrates = food_carbohydrates;
        this.food_fat = food_fat;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public double getFood_kcal() {
        return food_kcal;
    }

    public void setFood_kcal(double food_kcal) {
        this.food_kcal = food_kcal;
    }

    public double getFood_proteins() {
        return food_proteins;
    }

    public void setFood_proteins(double food_proteins) {
        this.food_proteins = food_proteins;
    }

    public double getFood_carbohydrates() {
        return food_carbohydrates;
    }

    public void setFood_carbohydrates(double food_carbohydrates) {
        this.food_carbohydrates = food_carbohydrates;
    }

    public double getFood_fat() {
        return food_fat;
    }

    public void setFood_fat(double food_fat) {
        this.food_fat = food_fat;
    }

    @Override
    public String toString() {
        return "\n{ " +
                "food_id=" + food_id +
                " | food_name='" + food_name + '\'' +
                " | food_kcal=" + food_kcal +
                " | food_proteins=" + food_proteins +
                " | food_carbohydrates=" + food_carbohydrates +
                " | food_fat=" + food_fat +
                " }";
    }
}