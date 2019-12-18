package task3.playroom;
import task3.playroom.controller.ToyController;
import task3.playroom.model.Filter;
import task3.playroom.model.entity.Toy;

public class PlayRoomMain {

    public static void main(String[] args) {
        ToyController controller = new ToyController();
        controller.run();

//        Toy[] arr = new Toy[0];
//        (new Filter(arr)).getByColor("red").getArray();
//        (new Filter(arr)).getBySize(5).getArray();

    }
}
