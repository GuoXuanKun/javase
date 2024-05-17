package day240515.practice.p2.p2;

public class DogAgeComparator implements MyComparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.age == o2.age) {
            return 0;
        } if (o1.age > o2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}