package task5.t5_1regularExp.controller.utilities;

import task5.t5_1regularExp.model.JournalEntry;
import java.util.List;

public class Converter {

    public static String listToString(List<JournalEntry> list){
        StringBuilder sb = new StringBuilder();
        sb.append("_________________________________________________________________________\n");
        sb.append("|Name     |Surname  |Date of birth | Tel.            | Address            \n");
        sb.append("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        for (JournalEntry entry : list){
            sb.append("\n" + entry);
        }
        return sb.toString();
    }
}
