package task3.playroom.model;
import task3.playroom.model.entity.Toy;
import java.util.Comparator;

public class PlayRoomModel {

    PlayRoom<Toy> playRoom = new PlayRoom<>(new ToyArrayGenerator().generateToys());

    public Toy[] sortByPrice() {

        return playRoom.sortByParameter((Comparator<Toy>) (t1, t2) -> {
            if (t1.getPrice() - t2.getPrice() > 1) return 1;
            if (t1.getPrice() - t2.getPrice() < 1) return -1;
            return 0;
        });
    }

    public Toy[] sortByColor() {
        return playRoom.sortByParameter((Comparator<Toy>) (t1, t2) -> t1.getColor().compareToIgnoreCase(t2.getColor()));
    }

    public double calcTotalPrice() {
        return playRoom.calcTotalPrice();
    }
    public Toy[] getToysByDescription(String str){
        String[] token = str.split(",");
        Filter<Toy> filter = playRoom.getFilter();
        for(String s: token){
            if(filter.getArray().length == 0) return filter.getArray();
            String[] value = s.split(":");
            switch (value[0].trim().toLowerCase()){
                case "color":
                    filter = filter.getByColor(value[1].trim());
                    break;
                case "material":
                    filter = filter.getByMaterial(value[1].trim());
                    break;
                case "country":
                    filter = filter.getByCountry(value[1].trim());
                    break;
                case "size":
                    filter = filter.getBySize(Integer.parseInt(value[1]));
                    break;
                case "age":
                    filter = filter.getByAgeAbove(Integer.parseInt(value[1].trim()));
                    break;
            }
        }
        return filter.getArray();
    }

    public Toy[] getToysByColorAndMaterial(String color, String material) {
        return playRoom.getFilter().getByColor(color).getByMaterial(material).getArray();
    }

    public Toy[] getToysByAgeAbove(int age){
        return playRoom.getFilter().getByAgeAbove(age).getArray();
    }

    public Toy[] getAllToys(){
        return playRoom.getArrayOfToys();
    }
}
