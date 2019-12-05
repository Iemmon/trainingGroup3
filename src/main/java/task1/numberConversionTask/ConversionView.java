package task1.numberConversionTask;

public class ConversionView {
    public static final String CHOOSE_NUMERIC_SYSTEM = "Choose numeric system:";
    public static final String NUMERIC_SYSTEMS = "2 - Binary \n8 - Octal \n16 - Hexadecimal";
    public static final String INPUT_NUMBER = "Enter number:";
    public static final String WRONG_INPUT = "Inappropriate value, try again!";
    public static final String OUTPUT_RESULT = "Result:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String message, String resultNumber) {
        printMessage(message);
        System.out.println("view");
        System.out.println(resultNumber);
    }

}
