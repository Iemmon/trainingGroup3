package task3.enumTask;

public class EnamExample extends EnumClass {

    final static EnamExample ONE = new EnamExample(1, "ONE");
    final static EnamExample TWO = new EnamExample(2, "TWO");
    final static EnamExample THREE = new EnamExample(3, "THREE");

    protected EnamExample(int ordinal, String name) {
        super(ordinal, name);
    }
}
