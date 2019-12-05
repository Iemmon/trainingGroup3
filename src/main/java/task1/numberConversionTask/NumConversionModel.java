package task1.numberConversionTask;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class NumConversionModel {

    private static final int BINARY = 2;
    private static final int OCTAL = 8;
    private static final int HEXADECIMAL = 16;
    private static final char[] VALUES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private String number;

    public String getNumber() {
        return number;
    }

    public void convertNumber(int num, int numSystem) {
        char arr[] = new char[32];
        int i = arr.length - 1;
        while (num > 0) {
            arr[i--] = (VALUES[num % numSystem]);
            num /= numSystem;
        }
        this.number = separateAsString(arr);
    }

    private String separateAsString(char[] arr) {
        String result = "";
        for (char el : arr) {
            if (el != '\u0000') {
                result = result + el;
            }
        }
        return result;
    }
}