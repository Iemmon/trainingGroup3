package task5.t5_1regularExp.controller.actions;

import task5.t5_1regularExp.view.JournalView;
import task5.t5_1regularExp.view.Message;

public class ExitAction extends AbstractAction {
    JournalView view;

    public ExitAction(JournalView view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.print(Message.EXIT.toString());
        System.exit(0);
    }
}
