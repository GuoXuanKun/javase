package day240429.practice.verify;

public class Student extends Person{
   // state
    String school;

    // behavior
    public Student(String school) {
        // the superclass no-argument constructor is called.
        super();
        this.school = school;
    }

    public Student(String id, String school) {
        super(id);
        // 下面的代码会报错：Only one explicit constructor call allowed in constructor
        //super();
        this.school = school;
    }

    public Student(String id, String name, int age) {
        // 如果没有在子类的构造器中显式的调用父类的构造器，If a constructor does not explicitly invoke a superclass constructor,
        // the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
        // super();

        this.id = id;
        this.name = name;
        this.age = age;
    }
}
