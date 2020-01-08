package task5.t5_1regularExp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<JournalEntry> journal;

    public Journal(){
        journal = new ArrayList<>();
    }

    public List<JournalEntry> getJournal() {
        return journal;
    }

    public boolean addJournalEntry(String name, String surname, LocalDate dob, String tel, String address) {
        return journal.add(new JournalEntry(name, surname, dob, tel, address));
    }
}
