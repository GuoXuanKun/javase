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

}
