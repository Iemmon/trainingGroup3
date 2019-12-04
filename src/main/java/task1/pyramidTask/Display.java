package task1.pyramidTask;

public class Display {

    public static void displayPyramid(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (char el : matrix[i]) {
                if (el == 0) {
                    System.out.print(' ' + " ");
                } else {
                    System.out.print(el + " ");
                }
            }
            System.out.println();
        }
    }
}
