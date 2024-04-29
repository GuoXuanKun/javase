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
        this.school = school;
    }

}
