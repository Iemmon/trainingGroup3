package classwork.bank.utility;

import java.util.Scanner;

public class InputUtility {

    private static Scanner sc = new Scanner(System.in);

    public static int getValidMenuNumber(int numOfOptions) {
        int input;
        boolean isWrong = false;
        do {
            System.out.println("Choose menu number from above:");
            input = sc.nextInt();
            isWrong = input > 0 && input <= numOfOptions;

        } while (!sc.hasNextInt() && !isWrong);
        return input;
    }

    public static String getUserData() {
        return sc.nextLine();
    }

}
