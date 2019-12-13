package task2.shapesTask.controller;

import task2.shapesTask.model.AreaComparator;
import task2.shapesTask.model.ColorComparator;
import task2.shapesTask.view.ShapeView;
import task2.shapesTask.model.ShapeModel;
import task2.shapesTask.view.InputUtility;

public class ShapeController {
    private ShapeModel model = new ShapeModel();
    private ShapeView view = new ShapeView();
    private ConverterClass converter = new ConverterClass();

    public void runController() {
        int userInput;
        do {
            view.print(view.MAIN_MENU);
            userInput = InputUtility.inputMenuNumber(view, view.MAIN_MENU_LIMIT);
            switch (userInput) {
                case 1:
                    view.print(converter.convertArray(model.getBasicArrayOfShapes()));
                    break;
                case 2:
                    view.print(converter.convertArea(model.calcTotalArea(), "all"));
                    break;
                case 3:
                    while (true) {
                        view.print(view.SHAPE_MENU);
                        int userShape = InputUtility.inputMenuNumber(view, view.SHAPE_MENU_LIMIT);
                        if (userShape == 4) break;
                        String shapeType = getShapeTypeFromInput(userShape);
                        view.print(converter.convertArea(model.calcTotalAreaOfType(shapeType), shapeType));
                    }
                    break;
                case 4:
                    view.print(converter.convertArray(model.sortShapes(new AreaComparator())));
                    break;
                case 5:
                    view.print(converter.convertArray(model.sortShapes(new ColorComparator())));
                    break;
                case 6:
                    model.generateNewArray();
                    view.print("Array is updated");
                    break;
                case 7:
                    view.print("See you later!");
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
