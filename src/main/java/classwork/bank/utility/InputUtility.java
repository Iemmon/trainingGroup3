package classwork.bank.utility;

import java.util.Scanner;

public class InputUtility {

    private static final Scanner sc = new Scanner(System.in);

    public static int getValidMenuNumber(int numOfOptions) {
        String input;
        boolean isCorrect = false;
        System.out.println("Choose menu number from above:");
        input = sc.nextLine();
        return input.contentEquals("1") ? 1 : 2;
    }

    public static String getUserData() {
        return sc.nextLine();
    }

}
