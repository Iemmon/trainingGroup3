package task3.playroom.model.entity;

public class PlushHorse extends Toy  {
    public PlushHorse(String color, int size, String countryOfOrigin, int childAge, double price) {
        super("PLUSH", color, size, countryOfOrigin, childAge, price);
    }

    public void ride(){
            System.out.println("Neigh!");
    }
}
