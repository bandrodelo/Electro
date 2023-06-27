package Test05;

public class Circle extends Figure{
    private Point a;
    private double radius;

    public Circle(Point a, double radius) {
        if (radius<=0 || a==null )
            throw new IllegalArgumentException("Triangle is degenerative");
        this.a = a;
        this.radius = radius;
    }

    public Point getA() {
        return a;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Point centroid() {

        return a;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Circle){
            double area1 = Math.PI * (getRadius() * getRadius());
            double area2 = Math.PI * (((Circle) figure).getRadius() * ((Circle) figure).getRadius());
            if (area1==area2) {
                return true;
            }
        }
        return false;
    }
}
