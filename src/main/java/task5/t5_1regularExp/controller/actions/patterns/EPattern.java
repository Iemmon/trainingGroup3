package task5.t5_1regularExp.controller.actions.patterns;

public enum EPattern {

    FULL_NAME("([А-Я][а-я]+)\\s([А-Я][а-я]+)"),
    DATE31("([012]?\\d|3[01])[\\s.,:](10|12|[0]?[1|3|5|7|8])[\\s.,:](19[789]\\d|20[01]\\d)"),
    DATE30("([012]?\\d|30)[\\s.,:](11|[0]?(4|6|9))[\\s.,:](19[789]\\d|20[01]\\d)"),
    DATE28("(2[0-8]|[01]?\\d)[\\s.,:][0]?[2][\\s.,:](19[789]\\d|20[01]\\d)"),
    DATE29("(0?[1-9]|[12]?\\d)[\\s.,:][0]?[2][\\s.,:]((197|199|201)[26]|((198|200)[048]))"),
    ADDRESS("([А-Яа-я.\\-\\d\\s]+\\s)?[А-Яа-я.\\-]+\\s([А-Яа-я.\\-,]+\\s)?(дом|д)?[.\\s]*[\\d,]+\\s?(квартира|кв)?[.\\s]?[\\d]*"),
    PHONE_NUMBER("((\\+38)[\\-]?)?(\\(?\\d{3}\\)?[\\-]?)?[\\d\\-]{7,10}"),
    CHOICE("(add|show|exit)"),
    CONTINUE("y|n");

    EPattern(String pattern){
        this.pattern = pattern;
    }
    String pattern;

    @Override
    public String toString() {
        return pattern;
    }
}
