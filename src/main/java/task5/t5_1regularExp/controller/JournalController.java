package task5.t5_1regularExp.controller;

import task5.t5_1regularExp.controller.utilities.InputUtility;
import task5.t5_1regularExp.controller.utilities.Validator;
import task5.t5_1regularExp.model.Journal;
import task5.t5_1regularExp.controller.actions.patterns.EPattern;
import task5.t5_1regularExp.controller.actions.*;
import task5.t5_1regularExp.view.JournalView;
import task5.t5_1regularExp.view.Message;

public class JournalController {
    Journal journal;
    JournalView view;

    public JournalController() {
        journal = new Journal();
        view = new JournalView();
    }

    public void run() {
        view.print(Message.INFO.toString());
        while (true) {
            view.print(Message.OPTIONS.toString());
            String input = InputUtility.getValidInput(view, EPattern.CHOICE).toUpperCase();
            switch (input){
                case "ADD":
                    do {
                        new AddAction(journal, view).execute();
                    } while (continueAdding());
                    break;
                case "SHOW":
                    new ShowAction(journal, view).execute();
                    break;
                case "EXIT":
                    new ExitAction(view).execute();
                    break;
            }
        }
    }

    private boolean continueAdding() {
        view.print(Message.CONTINUE.toString());
        String input = InputUtility.getValidInput(view, EPattern.CONTINUE);
        return Validator.isValid(input, "y");
    }
}
