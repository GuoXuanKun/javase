package day240606.practice.teach.singleton_demo.before.enum_verson;

public enum Student {
    INSTANCE;

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
