package task3.playroom.model;
import task3.playroom.model.entity.*;
import java.util.Random;

public class ToyArrayGenerator {
    private ToyFactory toyFactory = new ToyFactory();

    public Toy[] generateToys() {
        Toy[] toys = new Toy[30];
        for (int i = 0; i < toys.length; i++) {
            toys[i] = toyFactory.generateToy((int) (Math.random() * 7));
        }
        return toys;
    }

    private class ToyFactory {
        private final String[] colors = {"RED", "GREEN", "BLUE", "SILVER", "PURPLE"};
        private final String[] materials = {"WOOD", "PLASTIC", "PLUSH", "RUBBER", "FUR"};
        private final String[] countries = {"USA", "UK", "CHINA"};

        public Toy generateToy(int i) {
            Random random = new Random();
            Toy toy = null;
            String color = colors[random.nextInt(colors.length)];
            String material = materials[random.nextInt(materials.length)];
            int size = random.nextInt(6);
            String county = countries[random.nextInt(countries.length)];
            int age = random.nextInt(15);
            double price = random.nextDouble() * 10;
            int numOfPieces = random.nextInt(100) + 1;
            switch (i) {
                case 0:
                    toy = new Ball(material, color, size, county, age, price);
                    break;
                case 1:
                    toy = new BuildingBlocks(material, color, size, county, age, price, numOfPieces);
                    break;
                case 2:
                    toy = new Car(material, color, size, county, age, price);
                    break;
                case 3:
                    toy = new PlushHorse(color, size, county, age, price);
                    break;
                case 4:
                    toy = new Lego(color, size, county, age, price, numOfPieces);
                    break;
                case 5:
                    toy = new RockingHorse(color, size, county, age, price);
                case 6:
                    toy = new StickHorse(color, size, county, age, price);
            }
            return toy;
        }
    }
}
