package task3.playroom.model.entity;

public class BuildingBlocks extends Toy  {
    private int numOfPieces;
    public BuildingBlocks(String material, String color, int size, String countryOfOrigin, int childAge, double price, int numOfPieces) {
        super(material, color, size, countryOfOrigin, childAge, price);
        this.numOfPieces = numOfPieces;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "Number of pieces: " + numOfPieces + "\n";
    }
}
