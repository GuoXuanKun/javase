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


        // 思路：有没有一种方式可以判断出 animal 是否属于某种子类的具体类型
        // 假设有，你就可以怎么做...
        if (animal instanceof Dog Dog) {
            Dog dog = (Dog) animal;
            dog.www();
        }


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
