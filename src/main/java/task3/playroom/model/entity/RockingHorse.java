package task3.playroom.model.entity;

public class RockingHorse extends PlushHorse {
    public RockingHorse(String color, int size, String countryOfOrigin, int childAge, double price) {
        super(color, size, countryOfOrigin, childAge, price);
    }

    @Override
    public void ride() {
        System.out.println("Swing back and forth a rocking horse!");
    }
}
