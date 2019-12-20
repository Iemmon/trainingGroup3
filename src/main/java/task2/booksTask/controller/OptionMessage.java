package task2.booksTask.controller;

public enum OptionMessage {

    MAIN_MENU_MESSAGE{
        @Override
        public String toString() {
            return "1. Print list of books\n" +
                    "2. Sort list by publishing house\n" +
                    "3. Get books of certain author\n" +
                    "4. Get books of certain publishing house\n" +
                    "5. Get books published after certain year\n" +
                    "6. Create a new set of books" + "\n" +
                    "0. Exit program";
        }
    },
    ENTER_YEAR_MESSAGE{
        @Override
        public String toString() {
            return "Enter year:";
        }
    },
    WRONG_INPUT_MESSAGE{
        @Override
        public String toString() {
            return "Invalid action, try again:";
        }
    },
    UPDATE_MESSAGE{
        @Override
        public String toString() {
            return "List of books is updated!";
        }
    }
}