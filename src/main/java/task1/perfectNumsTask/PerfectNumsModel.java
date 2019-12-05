package task1.perfectNumsTask;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectNumsModel {

    private long[] perfectNumbers;

    public long[] getPerfectNumbers() {
        return perfectNumbers;
    }

    public void generatePerfectNums(long limit) {
        long[] perfectNums = new long[10];
        perfectNums[0] = 6;
        if (limit < 28) {
            this.perfectNumbers = trimToSize(perfectNums);
            return;
        }
        long[] cubes = getArrayOfCubicNumbers(limit);
        for (int i = 0, index = 1; i < cubes.length; i++) {
            long dividersSum = countSumOfDividers(cubes[i]);
            if (cubes[i] == 0) {
                break;
            }
            if (cubes[i] == dividersSum) {
                perfectNums[index] = cubes[i];
                index++;
            }
        }
        this.perfectNumbers = trimToSize(perfectNums);
    }

    private long countSumOfDividers(long num) {
        long sum = 0;
        long limit = num / 2;
        for (long divider = 1; divider <= limit; divider++) {
            if (num % divider == 0) {
                sum = sum + divider;
            }
            if (divider == 2) {
                limit = limit / 2;
                sum = sum + num / divider;
            }
        }
        return sum;
    }

    private long[] getArrayOfCubicNumbers(long limit) {
        long cube = 0;
        long[] cubes = new long[1000];
        int index = 0;
        for (long i = 1; cube <= limit; i += 2) {
            cube = cube + i * i * i;
            cubes[index] = cube;
            index++;
        }
        return cubes;
    }

    private long[] trimToSize(long[] arr) {
        int size = 0;
        for (long el : arr) {
            if (el != 0) {
                size++;
            } else {
                break;
            }
        }
        long[] newArray = new long[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
