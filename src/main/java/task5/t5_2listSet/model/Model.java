package task5.t5_2listSet.model;

import java.util.*;

public class Model {
    List<Integer> list;
    Set<Integer> set;

    public Model() {
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public Set fillSet(int size, int limit) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            if(!set.add(random.nextInt(limit))){
                i--;
            }
        }
        return set;
    }

    public List fillList(int size, int limit){
        Random random = new Random();
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(limit));
        }
        return list;
    }

}
