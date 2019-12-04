package task1.numberConversionTask;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class NumConversion {

    public static void main(String[] args) {
        int[] container = new int[10];
        System.out.println("Octal: ");
        convertToOctal(600);
        System.out.println("Hex: ");
        convertToHexadecimal(500);
        System.out.println("Bin: ");
        convertToBinary(8);

    }

    public static char[] convertToOctal(int num) {
        char[] result = new char[255];
        int length = result.length - 1;
        if (num > 7) {
            while (num != 0) {
                result[length] = (char) ((num % 8) + 48);
                length = length - 1;
                System.out.println(num % 8);
                num = num / 8;
            }
            return copyOfRange(result, length + 1, result.length);
        } else {
            return new char[]{(char) (num + 48)};
        }
    }

    public static char[] convertToHexadecimal(int num) {
        char[] result = new char[255];
        int length = result.length - 1;
        while (num != 0) {
            switch (num % 16) {
                case 10:
                    result[length] = 'A';
                    break;
                case 11:
                    result[length] = 'B';
                    break;
                case 12:
                    result[length] = 'C';
                    break;
                case 13:
                    result[length] = 'D';
                    break;
                case 14:
                    result[length] = 'E';
                    break;
                case 15:
                    result[length] = 'F';
                    break;
                default:
                    result[length] = (char) ((num % 16) + 48);
                    System.out.println(num % 16);

            }
            length = length - 1;
            num = num / 16;
        }
        return copyOfRange(result, length + 1, result.length);
    }

    public static char[] convertToBinary(int num) {
        char[] result = new char[255];
        int length = result.length - 1;
        while (num != 0) {
            result[length] = (char) ((num % 2) + 48);
            length = length - 1;
            System.out.print(num % 2 + " ");
            num = num / 2;
        }

        return copyOfRange(result, length + 1, result.length);
    }

    private static char[] copyOfRange(char[] arr, int start, int end) {

        char[] newArr = new char[Math.abs(end - start)];
        if ((end - start) > 0) {
            for (int i = 0, j = start; i < newArr.length; i++, j++) {
                newArr[i] = arr[j];
            }
        } else {
            for (int i = newArr.length - 1, j = end; i >= 0; i--, j++) {
                System.out.println("i " + i);
                System.out.println("j " + j);
                newArr[i] = arr[j];
            }
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println();
        return newArr;
    }
}
