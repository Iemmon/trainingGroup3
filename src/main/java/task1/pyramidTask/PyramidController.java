package task1.pyramidTask;

public class PyramidController {

    private PyramidView pyramidView;
    private PyramidModel pyramidModel;

    public PyramidController(PyramidModel pyramidModel, PyramidView pyramidView) {
        this.pyramidModel = pyramidModel;
        this.pyramidView = pyramidView;
    }

    public void generatePyramid() {
        pyramidModel.buildPyramid(InputUtility.inputSizeValue(pyramidView));
        pyramidView.printResult(pyramidView.OUTPUT_RESULT, pyramidModel.getPyramid());
    }


}
