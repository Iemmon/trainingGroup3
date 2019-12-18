package task3.playroom.model.entity;

public abstract class Toy {
    protected String material;
    protected String color;
    protected int size;
    protected String producingCountry;
    protected int childAge;
    protected double price;

    public Toy(String material, String color, int size, String producingCountry, int childAge, double price) {
        this.material = material;
        this.color = color;
        this.size = size;
        this.producingCountry = producingCountry;
        this.childAge = childAge;
        this.price = price;
    }

    public String getInfo() {

        return  "=> Name: " + this.getClass().getSimpleName() + " \t" +
                "Material: " + material + " \t" +
                "Color: " + color + " \t" +
                "Size: " + size + " \t" +
                "Country of origin: " + producingCountry + " \t" +
                "Designed for age: " + childAge + " \t" +
                String.format("Price: %.2f", price) + "\n";
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public int getChildAge() {
        return childAge;
    }

    public String getCountry() {
        return producingCountry;
    }

}
