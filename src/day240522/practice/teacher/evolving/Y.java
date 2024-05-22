package day240522.practice.teacher.evolving;

public interface Y {
    void teach();
    void play();
    default void xxx() {
        System.out.println("Y.xxx");
    }

    static void zzz() {
        System.out.println("Y.zzz");
    }
}

interface YPlusPlus extends Y {
    void sing();
}

class Y4 implements YPlusPlus {

    @Override
    public void sing() {

    }

    @Override
    public void teach() {

    }

    @Override
    public void play() {

    }
}

class Y1 implements Y {
    @Override
    public void teach() {
        System.out.println("Y1.teach");
    }

    @Override
    public void play() {

    }
}

class Y2 implements Y {
    @Override
    public void teach() {
        System.out.println("Y2.teach");
    }

    @Override
    public void play() {

    }
}

class Y3 implements Y {
    @Override
    public void teach() {

    }

    @Override
    public void play() {

    }
}
