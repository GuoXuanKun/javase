package day240428.practice.question;

public class Boy extends Person{

    private String id;
    private String school;

    public String getId() {
        return id;
    }

    public Boy setId(String id) {
        this.id = id;
        return this;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
