package day240515.practice.p2.p2;

public class MyInt {
    //    state
    private int value;

    //    Constructor

    // since="8"就表示从Java 8版本开始，这个实体就被标记为过时。
    // forRemoval = true表示这个实体在未来的版本中将被移除。
    @Deprecated(since="8", forRemoval = true)
    public MyInt(int value) {
        this.value = value;
    }

    //    behavior
    public int intValue() {
        return value;
    }
    public double doubleValue() {
        return (double) value;
    }

    @Override
    public String toString() {
        return "" + this.value;
    }
}
