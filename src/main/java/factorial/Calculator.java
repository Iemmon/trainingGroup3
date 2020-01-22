package factorial;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public String getFactorial(int value) {
        List<Integer> numAsList = numToList(value);
        for (int i = value - 1; i > 0; i--) {
            numAsList = multiply(numAsList, numToList(i));
        }
        return listToString(numAsList);
    }

    public String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        sb.reverse();
        while (sb.charAt(0) == '0') {
            sb.delete(0, 1);
        }

        return sb.toString();
    }

    public List<Integer> numToList(int value) {
        List<Integer> number = new ArrayList<>();
        while (value > 0) {
            number.add(value % 10);
            value /= 10;
        }
        return number;
    }

    public List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
        if (num1.size() < num2.size()) {
            List<Integer> temp = num1;
            num1 = num2;
            num2 = temp;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num2.size(); i++) {
            for (int j = 0; j < num1.size(); j++) {
                sum(result, num2.get(i) * num1.get(j), j + i);
            }
        }
        return result;
    }

    public void sum(List<Integer> arr, int num, int position) {
        if (num == 0) {
            if (arr.size() <= position) {
                arr.add(0);
            }
            return;
        }
        int number = num;
        if (arr.size() > position) {
            number += arr.get(position);
        }
        if (arr.size() <= position) {
            arr.add(number % 10);
        } else {
            arr.set(position, number % 10);
        }
        sum(arr, number / 10, position + 1);
    }
}
