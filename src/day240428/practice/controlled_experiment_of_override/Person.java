package day240428.practice.controlled_experiment_of_override;

public class Person {

    public void eat(){
        System.out.println("人类要吃饭");
    }

    public String drink(){
        System.out.println("喝水");
        return "喝水";
    }

    public Person personal(){
        return null;
    }

}
