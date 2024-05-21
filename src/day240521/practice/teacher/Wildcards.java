package day240521.practice.teacher;

public class Wildcards {
    // Unbounded Wildcards 无界通配符 (This is called a list of unknown type)
    public static void m1(GenericClass<?> m) {
        System.out.println(m);
    }

    // Upper Bounded Wildcards 上限通配符
    public static void m2(GenericClass<? extends A> m) {
        System.out.println(m);
    }

    // Lower Bounded Wildcards 下限通配符
    public static void m3(GenericClass<? super B> m) {
        System.out.println(m);
    }

    public static void main(String[] args) {
        Wildcards.m1(new GenericClass<A>());
        Wildcards.m1(new GenericClass<B>());
        Wildcards.m1(new GenericClass<C>());
        Wildcards.m1(new GenericClass<Z>());
        Wildcards.m1(new GenericClass<String>());

        // Wildcards.m2(new GenericClass<Object>());
        Wildcards.m2(new GenericClass<A>());
        Wildcards.m2(new GenericClass<B>());
        Wildcards.m2(new GenericClass<C>());
        // Wildcards.m2(new GenericClass<Z>());

        Wildcards.m3(new GenericClass<Object>());
        Wildcards.m3(new GenericClass<A>());
        Wildcards.m3(new GenericClass<B>());
        //Wildcards.m3(new GenericClass<C>());
    }
}

