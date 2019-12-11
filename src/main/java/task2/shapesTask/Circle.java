package task2.shapesTask;

public class Circle extends Shape{
    private int radius;

    public Circle(Color shapeColor, int radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }
}
