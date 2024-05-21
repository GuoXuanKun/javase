package day240521.practice.teacher.group;

public class Group {
    String key;
    String value;

    public Group(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String get(String key) {
        if (key.equals(this.key)) {
            return this.value;
        } else {
            return "未知";
        }
    }

    public void set(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
