package day240428.practice.controlled_experiment_of_override;

public class Girl extends Person{
    @Override
    public void eat() {
        System.out.println("女生也要吃饭");
    }
}
