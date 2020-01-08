package task5.t5_2listSet.controller.utileties;

import java.util.Collection;

public class Converter {

    public static String collectionToString(Collection<Integer> collection){
        StringBuilder sb = new StringBuilder();
        for (Integer i : collection){
            sb.append(i).append(" ");
        }

        return sb.toString();
    }
}
