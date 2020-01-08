package task5.t5_1regularExp.controller.utilities;

import task5.t5_1regularExp.controller.actions.patterns.EPattern;
import task5.t5_1regularExp.view.JournalView;
import task5.t5_1regularExp.view.Message;

import java.util.Scanner;

public class InputUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static String getValidInput(JournalView view, EPattern...patterns){
        do{
            String input = scanner.nextLine();
            for(EPattern p : patterns){
                if(Validator.isValid(input, p.toString())){
                    return input;
                }
            }
            view.print(Message.INVALID_VAL.toString());
        }while(true);
    }

    public static String getInput(){
        return scanner.nextLine();
    }

}
