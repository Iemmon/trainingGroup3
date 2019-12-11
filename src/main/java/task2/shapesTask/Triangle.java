package task2.shapesTask;

public class Triangle extends Shape {
    private final String SHAPE_NAME = "triangle";
    private int side1;
    private int side2;
    private int side3;
    private double halfPerimeter;

    private int area;

    public Triangle(Color shapeColor, int side1, int side2, int side3) {
        super(shapeColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.halfPerimeter = (side1 + side2 + side3)/2;
    }

    @Override
    public String toString() {
        return super.toString() + ", side1 = " + side1 + ", side2 =" + side2 + ", side3 = " + side3;
    }

    @Override
    public String getShapeColor() {
        return super.getShapeColor();
    }

    public int getArea() {
        return area;
    }

    @Override
    public double calcArea() {
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        return area;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }
}
