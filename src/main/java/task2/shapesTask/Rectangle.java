package task2.shapesTask;

public class Rectangle  extends Shape{
    private final String SHAPE_NAME = "rectangle";
    private double width;
    private double height;

    public Rectangle(Color shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + ", w=" + width + ", h=" + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public void draw(){
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }
}
