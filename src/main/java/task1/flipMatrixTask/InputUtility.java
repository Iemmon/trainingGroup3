package task1.flipMatrixTask;

import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static int inputSizeValue(MatrixView matrixView){
        matrixView.printMessage(matrixView.INPUT_MATRIX_SIZE);
        int input = -1;
        while(!scanner.hasNextInt() || ((input = scanner.nextInt()) < 2)){
            matrixView.printMessage(matrixView.WRONG_INPUT + "\n" + matrixView.INPUT_MATRIX_SIZE);
            scanner.next();
        }
        return input;
    }
}
