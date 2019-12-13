package task2.shapesTask.model.entity;

public class Circle extends Shape {
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
}
