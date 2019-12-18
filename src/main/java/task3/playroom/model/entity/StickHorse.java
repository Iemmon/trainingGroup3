package task3.playroom.model.entity;

public class StickHorse extends PlushHorse {

    public StickHorse(String color, int size, String countryOfOrigin, int childAge, double price) {
        super(color, size, countryOfOrigin, childAge, price);
    }

    @Override
    public void ride() {
        System.out.println("Clip-clop-clip-clop");
    }
}
