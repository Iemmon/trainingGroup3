package task5.t5_3dictionary.controller.utilities;

import java.util.regex.Pattern;

public class Validator {

    public static boolean isValid(String word, String patternString){
        Pattern pattern = Pattern.compile(patternString);
        return pattern.matcher(word).matches();
    }

}
