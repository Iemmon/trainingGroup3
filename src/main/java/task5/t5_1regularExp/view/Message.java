package task5.t5_1regularExp.view;

public enum Message {

    INFO("Type 'add' to add new entry" +
            "\nType 'show' to see full journal" +
            "\nType 'exit' to end session"),
    OPTIONS("Choose option add/show/exit"),
    ENTER_NAME("Enter student's name and surname: "),
    ENTER_DATE("Enter student's date of birth: "),
    ENTER_ADDRESS("Enter address: "),
    ENTER_TEL("Enter phone number: "),
    INVALID_VAL("Invalid value, try again: "),
    ADD_SUCCESSFULLY("Entry successfully created"),
    CONTINUE("Continue adding? Y/n"),
    EXIT("Session is over, result won't be saved");

    Message(String message) {
        this.message = message;
    }

    String message;

    @Override
    public String toString() {
        return message;
    }
}
