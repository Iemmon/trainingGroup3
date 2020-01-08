package task5.t5_2listSet.controller;

import task5.t5_2listSet.controller.utileties.Converter;
import task5.t5_2listSet.controller.utileties.InputUtility;
import task5.t5_2listSet.view.View;
import task5.t5_2listSet.model.Model;

public class Controller {
    View view;
    Model model;

    public Controller(){
        view = new View();
        model = new Model();
    }

    public void run(){
        view.print("Enter collection size: ");
        int size = InputUtility.getInt(view);
        view.print("Enter max value of element: ");
        int limit = InputUtility.getInt(view);
        view.print("---SET---");
        view.print(Converter.collectionToString(model.fillSet(size, limit)));
        view.print("---LIST---");
        view.print(Converter.collectionToString(model.fillList(size, limit)));

    }


}
