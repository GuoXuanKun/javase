package day240522.practice.teacher.evolving;

public interface Y {
    void teach();
    void play();
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
