package classwork.bank.service.sorter;

import java.util.Comparator;

public class Sorter<T extends Comparable<T>> implements Sortable<T> {

    @Override
    public void sort(T[] items) {
        int i, j, index;
        for (i = 0; i < items.length; i++) {
            index = i;
            for (j = 0; j < items.length; j++) {
                if (items[i].compareTo(items[j]) < 0) {
                    index = i;
                }
            }
            swap(items[i], items[j]);
        }
    }

    @Override
    public void sort(T[] items, Comparator<T> comparator) {
        int i, j, index;
        for (i = 0; i < items.length; i++) {
            index = i;
            for (j = 0; j < items.length; j++) {
                if (comparator.compare(items[i], items[j]) < 0) {
                    index = i;
                }
            }
            swap(items[i], items[j]);
        }
    }

    private void swap(T item1, T item2) {
        T temp = item1;
        item1 = item2;
        item2 = temp;
    }
}
