package task2.shapesTask.view;

public class ShapeView {
    public final String MAIN_MENU =
            "1. Print set of shapes" + "\n" +
            "2. Calculate total area" + "\n" +
            "3. Calculate total area of certain type" + "\n" +
            "4. Sort shapes in ascending order" + "\n" +
            "5. Sort shapes by color" + "\n" +
            "6. Generate new array" + "\n" +
            "7. Exit program";
    public final String SHAPE_MENU =
            "Choose shape from the list: " + "\n" +
            "1. Circle" + "\n" +
            "2. Rectangle" + "\n" +
            "3. Triangle" + "\n" +
            "4. Exit to main menu";
    public final int MAIN_MENU_LIMIT = 7;
    public final int SHAPE_MENU_LIMIT = 4;
    public final String WRONG_INPUT = "Invalid value, try again:";

    public void print(String message) {
        System.out.println(message);
    }

}
