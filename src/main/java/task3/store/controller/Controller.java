package task3.store.controller;
import task3.store.model.StoreModel;
import task3.store.view.StoreView;

public class Controller {
    StoreModel model = new StoreModel();
    StoreView view = new StoreView();

    public void run(){
        while(model.getNumOfDepartments() < 5){
        model.addDepartment(InputUtility.getUserInput());
        }

        view.print("SORT DEPARTMENTS BY LOCATION");
        view.print(Converter.convertToString(model.sortByLocation()));

        view.print("REMOVE DEPARTMENT: ENTER DEPARTMENT'S NAME");
        model.removeDepartment(InputUtility.getUserInput());

        view.print(Converter.convertToString(model.getDepartments()));

    }

}
