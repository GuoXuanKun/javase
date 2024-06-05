package day240605.practice.teach;

public class ReflectionDemo {
    public static void main(String[] args) {
        new L();
        System.out.println("--- --- ---");
        new O();

        new V();
        new V();

        new E();
        new E();
    }
}

class L {

}

class O {

}

class V {
    static {
        System.out.println("static block in V");
    }
}

class E {
    {
        System.out.println("non-static block in E");
    }
}
