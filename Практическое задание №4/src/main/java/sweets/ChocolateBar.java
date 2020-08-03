package sweets;

public class ChocolateBar extends Sweets {
    private Double size;

    public ChocolateBar(String name, Double price, Double weight, Double size) {
        super(name, price, weight);
        this.size = size;
    }

    public ChocolateBar() {
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chocolate Bar [" + super.toString() + ", size = " + size + "]";
    }
}
