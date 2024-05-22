package day240522.practice.teacher.interview1;

// Class 'TheSameDefaultMethod' must either be declared abstract or implement abstract method 'm()' in 'DA'

// day240522.TheSameDefaultMethod inherits unrelated defaults for m() from types day240522.DA and day240522.DB
public class TheSameDefaultMethod extends DD implements DA, DB {
    public static void main(String[] args) {
        new TheSameDefaultMethod().m();
    }
}

interface DA {
    //void m();

    default void m() {
        System.out.println("DA.m");
    }
}

interface DB {
    //void m();

    default void m() {
        System.out.println("DB.m");
    }
}

class DD {
    public void m() {
        System.out.println("DD.m");
    }
}
