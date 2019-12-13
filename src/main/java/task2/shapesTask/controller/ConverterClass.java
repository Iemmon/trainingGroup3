package task2.shapesTask.controller;

import task2.shapesTask.model.entity.Shape;

public class ConverterClass {

    public String convertArray(Shape[] shapes) {
        String result = "";
        for (Shape shape : shapes) {
            result += shape.draw();
        }
        return result;
    }

    public String convertArea(double area, String name) {
        return String.format("Total area of %s shapes is %.2f\n", name, area);
    }


}
