package task2.shapesTask;

public class ShapesController {
    private ShapesModel model;
    private ShapesView view;

    public ShapesController(ShapesModel model, ShapesView view) {
        this.model = model;
        this.view = view;
    }

    public void runController() {
        int userInput;
        do {
            userInput = InputUtility.inputMenuNumber(view, view.CHOOSE_ACTION, view.NUM_OF_MAIN_MENU_ITEMS);
            switch (userInput) {
                case 1:
                    view.printDataSet(model.getArrayOfShapes());
                    break;
                case 2:
                    model.calcTotalArea();
                    view.printTotalArea(model.getTotalArea(), "all");
                    break;
                case 3:
                    while (true) {
                        int userShape = InputUtility.inputMenuNumber(view, view.CHOOSE_SHAPE, view.NUM_OF_SHAPE_MENU_ITEMS);
                        if (userShape == 4) break;
                        String shapeType = getShapeTypeFromInput(userShape);
                        model.calcTotalAreaOfType(shapeType);
                        view.printTotalArea(model.getTotalArea(), shapeType);
                    }
                    break;
                case 4:
                    model.sortByArea();
                    view.printDataSet(model.getArrayOfShapes());
                    break;
                case 5:
                    model.sortByColour();
                    view.printDataSet(model.getArrayOfShapes());
                    break;
                case 6:
                    model.generateShapeArray();
                    view.printMessage("Array is updated, press 1 to print");
                    break;
                case 7:
                    view.printMessage("See you later!");
                    System.exit(0);
                    break;
            }
        } while (userInput != 0);
    }

    private String getShapeTypeFromInput(int number) {
        String shapeType = "";
        switch (number) {
            case 1:
                shapeType = "circle";
                break;
            case 2:
                shapeType = "rectangle";
                break;
            case 3:
                shapeType = "triangle";
                break;
        }
        return shapeType.toLowerCase();
    }
}
