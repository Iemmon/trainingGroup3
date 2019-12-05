package task1.perfectNumsTask;

import java.util.Arrays;

public class PerfectView {

    public static final String INPUT_LIMIT = "Enter limit:";
    public static final String WRONG_INPUT = "Inappropriate value, try again!";
    public static final String OUTPUT_RESULT = "Result:";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printResult(String message, long[] perfectNums) {
        printMessage(message);
        System.out.println(Arrays.toString(perfectNums));
    }
}
