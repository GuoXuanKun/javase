package day240520.practice.teacher;

public class WithGeneric<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public static void main(String[] args) {
        WithGeneric<String> withGeneric = new WithGeneric<String>();
        withGeneric.set("I am String");
        String s = withGeneric.get();
        System.out.println(s.length());
    }
}
