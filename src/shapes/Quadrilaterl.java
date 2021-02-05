package shapes;

public abstract class Quadrilaterl extends Shape implements Measurable{
    protected double length;
    protected double width;
    abstract void setLength(double length);
    abstract void setWidth(double width);
}
