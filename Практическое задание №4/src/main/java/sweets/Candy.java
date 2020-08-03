package sweets;

public class Candy extends Sweets{

    private String filling;

    public Candy(String name, Double price, Double weight, String filling) {
        super(name, price, weight);
        this.filling = filling;
    }

    public Candy(){};

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", filling = " + filling + "]";
    }
}
