package task2.shapesTask;

public class ShapesView {

    public final String CHOOSE_ACTION = "Choose action from menu: " + "\n" +
            "1. Print set of shapes" + "\n" +
            "2. Calculate total area" + "\n" +
            "3. Calculate total area of certain type" + "\n" +
            "4. Sort shapes in ascending order" + "\n" +
            "5. Sort shapes by color" + "\n" +
            "6. Generate new array" + "\n" +
            "7. Exit program";
    public final String CHOOSE_SHAPE = "Choose shape from the list: " + "\n" +
            "1. Circle" + "\n" +
            "2. Rectangle" + "\n" +
            "3. Triangle" + "\n" +
            "4. Exit to main menu";
    public final int NUM_OF_MAIN_MENU_ITEMS = 7;
    public final int NUM_OF_SHAPE_MENU_ITEMS = 4;

    public final String WRONG_INPUT = "Invalid value, try again:";

    public void printDataSet(Shape[] arrayOfShapes){
        for (Shape shape: arrayOfShapes) {
            shape.draw();
        }
    }
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printTotalArea(double area, String message){
        System.out.println("------------------------------------------------------");
        System.out.printf("Total area of shape type: %s is %.2f\n", message, area);
        System.out.println("------------------------------------------------------");
    }

}
