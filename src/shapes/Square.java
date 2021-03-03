package shapes;



public class Square extends Quadrilateral {
    protected double side;


    public Square(double side) {
        super(side, side);
    }


    @Override
    public double getPerimeter() {
        return 4*length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}