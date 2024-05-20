package day240520.practice.teacher;

public class WithoutGeneric {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return object;
    }

    public static void main(String[] args) {
        WithoutGeneric withoutGeneric = new WithoutGeneric();

        withoutGeneric.set("I am String");

        Object o = withoutGeneric.get();
        //System.out.println(o.length());
        String os = (String) withoutGeneric.get();
        System.out.println(os.length());
    }
}
