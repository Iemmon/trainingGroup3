package task5.t5_1regularExp.controller.utilities;

import java.util.regex.Pattern;

public class Validator {

    public static boolean isValid(String input, String patternString){
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(input).matches();
    }
}

