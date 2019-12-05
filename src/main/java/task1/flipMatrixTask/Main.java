package task1.flipMatrixTask;

public class Main {
    public static void main(String[] args) {
        MatrixView matrixView = new MatrixView();
        FlipMatrixModel flipMatrixModel = new FlipMatrixModel();
        MatrixController matrixController = new MatrixController(flipMatrixModel, matrixView);
        matrixController.generateMatrix();
    }
}
