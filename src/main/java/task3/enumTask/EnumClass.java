package task3.enumTask;

public class EnumClass<T extends EnumClass<T>> implements Comparable<T> {

    private int ordinal;
    private String name;

    protected EnumClass(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public int ordinal() {
        return ordinal;
    }


    public String name(){
        return name;
    }

    @Override
    public int compareTo(T o) {
        return ordinal - o.ordinal();
    }

    public final boolean equals(Object o){
        return this == o;
    }

    public final int hashCode(){
        return ordinal;
    }

    public String toString(){
        return name();
    }
}
