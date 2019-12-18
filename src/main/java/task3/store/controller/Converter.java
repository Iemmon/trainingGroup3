package task3.store.controller;
import task3.store.model.Store;

public class Converter {
    public static String convertToString(Store.Department[] depts){
        String result = "";
        for(Store.Department d : depts){
            result += d.toString() + "\n";
        }
        return result;
    }
}
