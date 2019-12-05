package task1.pyramidTask;

public class Main {
    public static void main(String[] args) {
        PyramidModel pyramidModel = new PyramidModel();
        PyramidView pyramidView = new PyramidView();
        PyramidController pyramidController = new PyramidController(pyramidModel, pyramidView);
        pyramidController.generatePyramid();
    }
}
