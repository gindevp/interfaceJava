public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double redius, String color, String fillesd) {
        super(redius, color, fillesd);
    }

    public ComparableCircle(double redius) {
        super(redius);
    }

    @Override
    public int compato(ComparableCircle o) {
        if (getRedius() > o.getRedius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
