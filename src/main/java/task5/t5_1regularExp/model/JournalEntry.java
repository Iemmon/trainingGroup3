package task5.t5_1regularExp.model;

import java.time.LocalDate;

public class JournalEntry {
    private String name;
    private String surname;
    private LocalDate dob;
    private String tel;
    private String address;

    public JournalEntry(String name, String surname, LocalDate dob, String tel, String address) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.tel = tel;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\t" + surname + "\t" + dob + "\t" + tel + "\t" + address + "\n" +
                "----------------------------------------------------------------------";
    }
}
