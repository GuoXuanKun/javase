package day240521.practice.me.p3;

public class Java2403<T> {
    //    state
    T group;
    T groupMember;

    //    constructor

    public Java2403() {
    }

    public Java2403(T group, T groupMember) {
        this.group = group;
        this.groupMember = groupMember;
    }

    // behavior
    public void setGroupAndMenber(T group, T groupMember) {
        this.group = group;
        this.groupMember = groupMember;
    }

    public T getGroupMember(T group) {
            return groupMember;
    }

    @Override
    public String toString() {
        return "Java2403{" +
                "group=" + group +
                ", groupMember=" + groupMember +
                '}';
    }
}
