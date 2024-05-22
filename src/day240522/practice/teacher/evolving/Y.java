package day240522.practice.teacher.evolving;

public interface Y {
    void teach();
}

class Y1 implements Y {
    @Override
    public void teach() {
        System.out.println("Y1.teach");
    }
}

class Y2 implements Y {
    @Override
    public void teach() {
        System.out.println("Y2.teach");
    }
}

class Y3 implements Y {
    @Override
    public void teach() {

    }
}
