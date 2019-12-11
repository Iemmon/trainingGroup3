package task2.shapesTask;

public abstract class Shape implements Drawable {
    private Color shapeColor;

    public Shape(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": colorShape = " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor.toString();
    }

    public abstract double calcArea();

}
