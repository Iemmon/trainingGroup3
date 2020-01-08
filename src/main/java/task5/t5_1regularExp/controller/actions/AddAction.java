package task5.t5_1regularExp.controller.actions;

import task5.t5_1regularExp.controller.utilities.InputUtility;
import task5.t5_1regularExp.controller.actions.patterns.EPattern;
import task5.t5_1regularExp.model.Journal;
import task5.t5_1regularExp.view.JournalView;
import task5.t5_1regularExp.view.Message;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AddAction extends AbstractAction {
    JournalView view;
    Journal journal;

    public AddAction(Journal journal, JournalView view) {
        this.journal = journal;
        this.view = view;
    }

    @Override
    public void execute() {
        view.print(Message.ENTER_NAME.toString());
        String[] fullName = InputUtility.getValidInput(view, EPattern.FULL_NAME).split("\\s");

        view.print(Message.ENTER_DATE.toString());
        String dateOfBirth = InputUtility.getValidInput(view, EPattern.DATE31, EPattern.DATE29, EPattern.DATE28, EPattern.DATE30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dateOfBirth.replaceAll("[\\s.,:]", "\\/"), formatter);

        view.print(Message.ENTER_TEL.toString());
        String phone = InputUtility.getValidInput(view, EPattern.PHONE_NUMBER);

        view.print(Message.ENTER_ADDRESS.toString());
        String address = InputUtility.getValidInput(view, EPattern.ADDRESS);

        journal.addJournalEntry(fullName[0], fullName[1], date, phone, address);
        view.print(Message.ADD_SUCCESSFULLY.toString());
    }
}
