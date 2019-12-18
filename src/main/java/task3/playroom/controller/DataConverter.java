package task3.playroom.controller;

import task3.playroom.model.entity.Toy;

public class DataConverter {

    public static String convertArray(Toy[] arrayOfToys) {
        if(arrayOfToys.length == 0){
            return "Values not found";
        }
        String result = "";
        for(Toy toy : arrayOfToys){
            result += toy.getInfo();
        }
        return result;
    }

    public static String convertDouble(double d){
        return String.format("%.2f", d);
    }
}
