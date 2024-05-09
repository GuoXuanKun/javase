package day240509.practice.final_test_teacher;

public class FinalMethod {
    public final void fm() {

    }
}
class SubFinalMethod extends FinalMethod {
    // cannot override 'fm()' in 'xxx'; overridden method is final
    /*public final void fm() {

    }*/
}