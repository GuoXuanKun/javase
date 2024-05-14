package day240514.practice.p1;

public class Xxx implements Comparable{
    int xxx;

    public Xxx(int xxx) {
        this.xxx = xxx;
    }

    @Override
    public String toString() {
        return "Xxx{" +
                "xxx=" + xxx +
                '}';
    }

    @Override
    public int compareTo(Object s) {
        if (s instanceof Xxx) {
            Xxx other = (Xxx) s;
            if (this.xxx == other.xxx) {
                return 0;
            } if (this.xxx > other.xxx) {
                return 1;
            } else {
                return -1;
            }
        } else {
            // 后续学了异常之后，这里可以抛出异常
            System.out.println("类型不匹配");
            return -999;
        }
    }

}
