package task5.t5_1regularExp.controller.actions;

import task5.t5_1regularExp.controller.utilities.Converter;
import task5.t5_1regularExp.model.Journal;
import task5.t5_1regularExp.view.JournalView;

public class ShowAction extends AbstractAction {
    Journal journal;
    JournalView view;

    public ShowAction(Journal journal, JournalView view) {
        this.journal = journal;
        this.view = view;
    }

    @Override
    public void execute() {
        view.print(Converter.listToString(journal.getJournal()));
    }
}
