package task1.flipMatrixTask;

public class MatrixController {

    private FlipMatrixModel flipMatrixModel;
    private MatrixView matrixView;

    public MatrixController(FlipMatrixModel flipMatrixModel, MatrixView matrixView) {
        this.flipMatrixModel = flipMatrixModel;
        this.matrixView = matrixView;
    }

    public void generateMatrix() {
        flipMatrixModel.fillMatrix(InputUtility.inputSizeValue(matrixView));
        flipMatrixModel.flip();
        matrixView.printResult(matrixView.OUTPUT, flipMatrixModel.getInitialMatrix(), flipMatrixModel.getMatrix());
    }

}
