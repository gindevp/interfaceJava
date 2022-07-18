public class Circle {
    private double redius;
    private String color;
    private String fillesd;
    public Circle(){
    }

    public Circle(double redius, String color, String fillesd) {
        this.redius = redius;
        this.color = color;
        this.fillesd = fillesd;
    }

    public Circle(double redius) {
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFillesd() {
        return fillesd;
    }

    public void setFillesd(String fillesd) {
        this.fillesd = fillesd;
    }
}
