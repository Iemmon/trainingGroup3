package task5.t5_3dictionary.controller;

import task5.t5_3dictionary.controller.utilities.InputUtility;
import task5.t5_3dictionary.controller.utilities.Validator;
import task5.t5_3dictionary.model.DictionaryModel;
import task5.t5_3dictionary.view.DictionaryView;

public class DictionaryController {

    DictionaryModel model;
    DictionaryView view;

    public DictionaryController(){
        model = new DictionaryModel();
        view = new DictionaryView();
    }

    public void run(){
        while (true) {
            view.print("Choose action add/translate/end");
            String input = InputUtility.getInput();
            switch (input) {
                case "add":
                    addWord();
                    break;
                case "translate":
                    translatePhrase();
                    break;
                case "end":
                    System.exit(0);
            }
        }
    }

    private void addWord(){
        view.print("Enter word: ");
        String word = getValidWord(InputUtility.getInput(), "[А-Яа-я\\s\\-]+");
        view.print("Enter translation: ");
        String translation = getValidWord(InputUtility.getInput(), "[A-Za-z\\s\\-]+");
        model.addWord(word,translation);
        view.print("New word added");
    }

    private void translatePhrase(){
        String phrase = getValidWord(InputUtility.getInput(), "[А-Яа-я\\s]+");
        String[] separateWords = phrase.split(" ");
        view.print(model.translate(separateWords));
    }

    private String getValidWord(String word, String pattern){
        while (!Validator.isValid(word, pattern)){
            view.print("Invalid value, try again");
            word = InputUtility.getInput();
        }
        return word;
    }
}
