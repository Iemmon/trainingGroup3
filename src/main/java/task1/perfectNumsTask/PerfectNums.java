package task1.perfectNumsTask;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PerfectNums {
    public static void main(String[] args) {
        long[] perfectNums;
        perfectNums = getPerfectNums(8589869059L);
        displayPerfectNums(perfectNums);
        System.out.println(perfectNums.length);

    }

    public static long[] getPerfectNums(long border) {
        long cube = 0;
        long[] cubes = new long[1000];
        int index = 0;
        for (long i = 1; cube <= border; i += 2) {
            cube = cube + i * i * i;
            cubes[index] = cube;
            index++;
            System.out.print(cube + " ");
        }
        long[] perfectNums = new long[10];
        perfectNums[0] = 6;
        index = 1;
        for (long element : cubes) {
            long temp = 0;
            long limit = element / 2;
            for (long divider = 1; divider <= limit; divider++) {
                if (element % divider == 0) {
                    temp = temp + divider;
                }
                if (divider == 2) {
                    limit = limit / 2;
                    temp = temp + element / divider;
                    System.out.println("limit changed" + element);
                }
            }
            if (element == temp && element != 0) {
                perfectNums[index] = element;
                System.out.println("perfectNum: " + element);
                index++;
            }
            System.out.println("in progress..");
        }
        System.out.println();
        return perfectNums;
    }


    public static void displayPerfectNums(long[] arr) {
        for (long el : arr) {
            if (el != 0) {
                System.out.print(el + " ");
            }
        }
    }
}
