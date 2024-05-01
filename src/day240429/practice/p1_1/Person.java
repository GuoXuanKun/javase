package day240429.practice.p1_1;

public class Person {
    // 1. state
    String name;

    // 2. behavior
    public Person(String name) {
        this.name = name;
    }

    // 2. behavior
    public void adopt(Animal animal){

        // 新需求:
        // 如果外面传进来的是 Dog
        // 需要额外的输出一句 " 汪汪汪 "
        System.out.println(this.name + " 养了一只( " + animal.name + " )");
    }

//    public void adopt(Dog dog){
//        System.out.println(this.name + " 养了一只( " + dog.name + " )");
//    }
//
//    public void adopt(Pig pig){
//        System.out.println(this.name + " 养了一只( " + pig.name + " )");
//    }
//
//    public void adopt(Rabbit rabbit){
//        System.out.println(this.name + " 养了一只( " + rabbit.name + " )");
//    }
}
