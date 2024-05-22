package day240522.practice.teacher.interview1;

public interface ExtendMultipleInterfaces extends Q, W {
}

interface Q {
    void q1();
}

interface W {
    void w1();
}

class E implements ExtendMultipleInterfaces {

    @Override
    public void q1() {
        //
    }

    @Override
    public void w1() {
        //
    }
}
