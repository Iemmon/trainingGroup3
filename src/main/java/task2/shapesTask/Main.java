package task2.shapesTask;

public class Main {
    public static void main(String[] args) {
        ShapesModel model = new ShapesModel();
        ShapesView view = new ShapesView();
        ShapesController controller = new ShapesController(model, view);
        controller.runController();
    }
}
