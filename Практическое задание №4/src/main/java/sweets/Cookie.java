package sweets;

public class Cookie extends Sweets {
    private Double calories;

    public Cookie(String name, Double price, Double weight, Double calories) {
        super(name, price, weight);
        this.calories = calories;
    }

    public Cookie(){}

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Cookie [" + super.toString() + ", calories = " + calories + "]";
    }
}
