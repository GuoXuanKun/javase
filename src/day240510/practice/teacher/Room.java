package day240510.practice.teacher;

public class Room extends Sortable {
    String name;
    double area;

    public Room(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Sortable sortable) {
        Room room = (Room) sortable;
        if (this.area > room.area) {
            return 1;
        } else if (this.area < room.area) {
            return -1;
        } else {
            return 0;
        }
    }
}
