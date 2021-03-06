package task2.shapesTask.model;

import task2.shapesTask.model.entity.Shape;

import java.util.Comparator;

public class ColorComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return shape1.getShapeColor().compareTo(shape2.getShapeColor());
    }
}
