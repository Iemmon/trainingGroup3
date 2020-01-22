package classwork.bank.utility;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.unmodifiableList;

public final class CollectionUtility<T> {

    private CollectionUtility(){

    }
    public static <T> List<T> nullSafeListInit(List<T> items){

        return items == null ? emptyList() : unmodifiableList(items);
    }

}
