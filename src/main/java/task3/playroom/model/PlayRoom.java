package task3.playroom.model;
import task3.playroom.model.entity.Toy;
import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom<T extends Toy> {
    private T[] arrayOfToys;

    public PlayRoom(T[] toys){
        this.arrayOfToys = toys;
    }

    public T[] sortByParameter(Comparator comparator){
        T[] sorted = Arrays.copyOf(arrayOfToys, arrayOfToys.length);
        Arrays.sort(sorted, comparator);
        return sorted;
    }

    public double calcTotalPrice(){
        double total = 0;
       for(T toy: arrayOfToys){
           total += toy.getPrice();
       }
        return total;
    }


    public T[] getArrayOfToys() {
        return arrayOfToys;
    }

    public Filter<T> getFilter() {
        return new Filter<T>(arrayOfToys);
    }
}
