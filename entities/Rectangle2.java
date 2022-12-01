public class Rectangle2 extends Shape{
    private double width;
    private double height;

    public Rectangle2() {
        super();
    }

    public Rectangle2(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
