package task1.pyramidTask;

import java.util.Scanner;

public class Pyramid {

    private char[][] buildPyramid(int height) {
        int width = 2 * height - 1;
        char[][] pyrimid = new char[height][width];
        int middle = width / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                pyrimid[i][middle - j] = (char) ((i + 1) - j + 48);
                pyrimid[i][middle + j] = (char) ((i + 1) - j + 48);
            }
        }
        return pyrimid;
    }

    public void run(){
        System.out.println("Enter height: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        char[][] pyramid = buildPyramid(height);
        buildPyramid(height);
        Display.displayPyramid(pyramid);
    }



}
