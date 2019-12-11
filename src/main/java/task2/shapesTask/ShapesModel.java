package task2.shapesTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ShapesModel {

    private Shape[] arrayOfShapes;
    private double totalArea = 0;

    public ShapesModel() {
        generateShapeArray();
    }

    public void generateShapeArray() {
        Random random = new Random();
        Shape[] arrayOfShapes = new Shape[random.nextInt(10) + 10];
        fillShapeArr(arrayOfShapes);
        this.arrayOfShapes = arrayOfShapes;
    }

    public void calcTotalArea() {
        totalArea = 0;
        for (Shape shape : this.arrayOfShapes) {
            totalArea = totalArea + shape.calcArea();
        }
    }

    public void calcTotalAreaOfType(String type) {
        totalArea = 0;
        for (Shape shape : this.arrayOfShapes) {
            String currentType = shape.getClass().getSimpleName().toLowerCase();
            if (currentType.contains(type)) {
                totalArea = totalArea + shape.calcArea();
            }
        }
    }

    public void sortByArea() {
        Arrays.sort(this.arrayOfShapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                double result = shape1.calcArea() - shape2.calcArea();
                if (result > 0) {
                    return 1;
                }
                if (result < 0) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public void sortByColour() {
        Arrays.sort(this.arrayOfShapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape1, Shape shape2) {
                return shape1.getShapeColor().compareTo(shape2.getShapeColor());
            }
        });
    }

    private void fillShapeArr(Shape[] shapes) {
        Random random = new Random();
        int colorNumber;
        for (int i = 0; i < shapes.length; i++) {
            int shapeNumber = random.nextInt(3);
            switch (shapeNumber) {
                case 0:
                    colorNumber = random.nextInt(Color.values().length);
                    shapes[i] = new Triangle(Color.values()[colorNumber], random.nextInt(5) + 5, random.nextInt(5) + 5, random.nextInt(5) + 5);
                    break;
                case 1:
                    colorNumber = random.nextInt(Color.values().length);
                    shapes[i] = new Circle(Color.values()[colorNumber], random.nextInt(10) + 1);
                    break;
                case 2:
                    colorNumber = random.nextInt(Color.values().length);
                    shapes[i] = new Rectangle(Color.values()[colorNumber], random.nextInt(10) + 1, random.nextInt(10) + 1);
                    break;
            }
        }
    }

    public Shape[] getArrayOfShapes() {
        return arrayOfShapes;
    }

    public double getTotalArea() {
        return totalArea;
    }
}
