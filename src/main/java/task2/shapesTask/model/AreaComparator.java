package task2.shapesTask.model;

import task2.shapesTask.model.entity.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.calcArea(), shape2.calcArea());
    }
}
