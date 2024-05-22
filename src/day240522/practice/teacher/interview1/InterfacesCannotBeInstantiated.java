package day240522.practice.teacher.interview1;

public interface InterfacesCannotBeInstantiated {
    // Not allowed in interface
    //public InterfacesCannotBeInstantiated() {}

    // Note that the method signatures have no braces and are terminated with a semicolon.
    // braces {}
    // semicolon ;
    void m1();
}

class Test {
    public static void main(String[] args) {
        // 'Xxx' is abstract; cannot be instantiated
        //new InterfacesCannotBeInstantiated();
    }
}
