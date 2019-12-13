package task2.shapesTask.model;

import task2.shapesTask.model.entity.Color;
import task2.shapesTask.model.entity.Rectangle;
import task2.shapesTask.model.entity.Shape;
import task2.shapesTask.model.entity.Triangle;
import task2.shapesTask.model.entity.Circle;

import java.util.Random;

public class ShapesGenerator {
    private Shape[] shapesArray;

    public Shape[] getShapesArray() {
        return shapesArray;
    }

    public ShapesGenerator(){
        generateShapeArray();
    }

    private void generateShapeArray() {
        Random random = new Random();
        Shape[] arrayOfShapes = new Shape[random.nextInt(10) + 10];
        int colorNumber;
        for (int i = 0; i < arrayOfShapes.length; i++) {
            int shapeNumber = random.nextInt(3);
            switch (shapeNumber) {
                case 0:
                    colorNumber = random.nextInt(Color.values().length);
                    arrayOfShapes[i] = new Triangle(Color.values()[colorNumber], random.nextInt(5) + 5, random.nextInt(5) + 5, random.nextInt(5) + 5);
                    break;
                case 1:
                    colorNumber = random.nextInt(Color.values().length);
                    arrayOfShapes[i] = new Circle(Color.values()[colorNumber], random.nextInt(10) + 1);
                    break;
                case 2:
                    colorNumber = random.nextInt(Color.values().length);
                    arrayOfShapes[i] = new Rectangle(Color.values()[colorNumber], random.nextInt(10) + 1, random.nextInt(10) + 1);
                    break;
            }
        }
        shapesArray = arrayOfShapes;

    }

}
