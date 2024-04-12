package day240412;

public class Teach {

    // state (fields)
    String name;
    int age;

    // behavior (method)
    public void show(){
        System.out.println("name: " + name + " age: " + age);
    }

    // constructor
    public Teach(String p1 , int p2){
        name = p1;
        age = p2;
    }


}
