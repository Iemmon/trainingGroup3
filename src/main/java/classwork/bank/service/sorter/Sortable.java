package classwork.bank.service.sorter;

import java.util.Comparator;

public interface Sortable<T> {

    //implements Comparable
    void sort(T[] items);
    void sort(T[] items, Comparator<T> comparator);
}
