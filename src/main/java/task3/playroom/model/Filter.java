package task3.playroom.model;
import task3.playroom.model.entity.Toy;
import java.util.Arrays;

public class Filter<T extends Toy> {
    private T[] array;

    public Filter(T[] array) {
        this.array = array;
    }

    public Filter<Toy> getByColor(String color) {
        Toy[] arrayCopy = new Toy[array.length];
        int index = 0;
        for (T toy : array) {
            if (toy.getColor().compareToIgnoreCase(color) == 0) {
                arrayCopy[index++] = toy;
            }
        }
        arrayCopy = Arrays.copyOf(arrayCopy, index);
        return new Filter<Toy>(arrayCopy);
    }

    public Filter<Toy> getBySize(int size) {
        if(array.length == 0) return new Filter<Toy>(array);
        Toy[] copyArray = new Toy[array.length];
        int index = 0;
        for (T toy : array) {
            if (toy.getSize() == size) {
                copyArray[index++] = toy;
            }

        }
        copyArray = Arrays.copyOf(copyArray, index);
        return new Filter<>(copyArray);
    }

    public Filter<Toy> getByMaterial(String material) {
        Toy[] copyArray = new Toy[array.length];
        int index = 0;
        for (T toy : array) {
            if (toy.getMaterial().compareToIgnoreCase(material) == 0) {
                copyArray[index++] = toy;
            }

        }
        copyArray = Arrays.copyOf(copyArray, index);
        return new Filter<>(copyArray);
    }

    public Filter<Toy> getByCountry(String country) {
        Toy[] copyArray = new Toy[array.length];
        int index = 0;
        for (T toy : array) {
            if (toy.getCountry().compareToIgnoreCase(country) == 0) {
                copyArray[index++] = toy;
            }

        }
        copyArray = Arrays.copyOf(copyArray, index);
        return new Filter<>(copyArray);
    }

    public Filter<Toy> getByAgeUnder(int age) {
        Toy[] copyArray = new Toy[array.length];
        int index = 0;
        for (T toy : array) {
            if (toy.getChildAge() <= age) {
                copyArray[index++] = toy;
            }

        }
        copyArray = Arrays.copyOf(copyArray, index);
        return new Filter<>(copyArray);
    }

    public Filter<Toy> getByAgeAbove(int age) {
        Toy[] copyArray = new Toy[array.length];
        int index = 0;
        for (T toy : array) {
            if (toy.getChildAge() >= age) {
                copyArray[index++] = toy;
            }

        }
        copyArray = Arrays.copyOf(copyArray, index);
        return new Filter<>(copyArray);
    }

    public T[] getArray() {
        return array;
    }
}
