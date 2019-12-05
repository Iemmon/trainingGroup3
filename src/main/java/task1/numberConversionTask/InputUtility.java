package task1.numberConversionTask;

import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static int inputNumberValue(ConversionView conversionView) {
        conversionView.printMessage(conversionView.INPUT_NUMBER);
        int input = -1;
        while (!scanner.hasNextInt() || ((input = scanner.nextInt()) < 0)) {
            conversionView.printMessage(conversionView.WRONG_INPUT + "\n" + conversionView.INPUT_NUMBER);
            scanner.next();
        }
        return input;
    }

    public static int inputNumericSystem(ConversionView conversionView) {
        do {
            conversionView.printMessage(conversionView.CHOOSE_NUMERIC_SYSTEM);
            conversionView.printMessage(conversionView.NUMERIC_SYSTEMS);
            String input = scanner.next();
            if (input.contentEquals("2") || input.contentEquals("8") || input.contentEquals("16")) {
                return Integer.parseInt(input);
            }
        }
        while (true);
    }

}
