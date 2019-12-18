package task3.playroom.controller;

import task3.playroom.model.PlayRoomModel;
import task3.playroom.view.PlayRoomView;

public class ToyController {
    PlayRoomModel model = new PlayRoomModel();
    PlayRoomView view = new PlayRoomView();

    public void run() {

        view.print("VIEW ALL TOYS");
        view.print("**************");
        view.print(DataConverter.convertArray(model.getAllToys()));

        view.print("**********************");
        view.print("CALCULATE TOTAL PRICE");
        view.print(DataConverter.convertDouble(model.calcTotalPrice()));

        view.print("*********************************");
        view.print("GET BLUE TOYS MADE IN UK");
        view.print(DataConverter.convertArray(model.getToysByDescription("color:blue,country:uk")));

        view.print("*********************************");
        view.print("GET FUR TOYS OF SIZE 5");
        view.print(DataConverter.convertArray(model.getToysByDescription("size:5,material:fur")));

        view.print("*********************************");
        view.print("SORT BY COLOR");
        view.print(DataConverter.convertArray(model.sortByColor()));
    }
}
