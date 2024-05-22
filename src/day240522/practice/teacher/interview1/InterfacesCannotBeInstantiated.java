package day240522.practice.teacher.interview1;

public interface InterfacesCannotBeInstantiated {
    // Not allowed in interface
    //public InterfacesCannotBeInstantiated() {}
}

class Test {
    public static void main(String[] args) {
        // 'Xxx' is abstract; cannot be instantiated
        //new InterfacesCannotBeInstantiated();
    }
}
