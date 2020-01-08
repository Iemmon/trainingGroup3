package task5.t5_2listSet.controller.utileties;

import task5.t5_2listSet.view.View;

import java.util.Scanner;

public class InputUtility {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(View view){
        while (!sc.hasNextInt()) {
          view.print("Invalid value, try again");
        }
        return sc.nextInt();
    }
}
