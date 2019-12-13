package task2.shapesTask.model;

import task2.shapesTask.model.entity.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel {
    private Shape[] basicArrayOfShapes;

    public ShapeModel() {
        generateNewArray();
    }

    public double calcTotalArea() {
        double totalArea = 0;
        for (Shape shape : basicArrayOfShapes) {
            totalArea = totalArea + shape.calcArea();
        }
        return totalArea;
    }

    public void generateNewArray(){
        basicArrayOfShapes = new ShapesGenerator().getShapesArray();
    }

    public double calcTotalAreaOfType(String type) {
        double totalArea = 0;
        for (Shape shape : basicArrayOfShapes) {
            String currentType = shape.getClass().getSimpleName().toLowerCase();
            if (currentType.contains(type)) {
                totalArea += shape.calcArea();
            }
        }
        return totalArea;
    }

    public Shape[] sortShapes(Comparator comparator){
        Shape[] arrayDuplicate =  Arrays.copyOf(basicArrayOfShapes, basicArrayOfShapes.length);
        Arrays.sort(arrayDuplicate, comparator);
        return arrayDuplicate;
    }

    public Shape[] getBasicArrayOfShapes() {
        return basicArrayOfShapes;
    }

}
