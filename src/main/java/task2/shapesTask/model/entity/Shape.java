package task2.shapesTask.model.entity;

import com.sun.javafx.binding.StringFormatter;
import task2.shapesTask.model.Drawable;

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

    @Override
    public String draw() {
        return String.format("%s; area=%.2f\n", this,  calcArea());
    }

}
