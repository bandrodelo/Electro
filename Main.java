package Test05;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {


//        Point a = new Point(0, 0);
//        Point b = new Point(1, 10);
//        Point c = new Point(11, 11);
//        Point d = new Point(19, 2);
//        Point a1 = new Point(-b.getX(), b.getY());
//        Quadrilateral bcda = new Quadrilateral(b, c, d, a);
//        Quadrilateral badc = new Quadrilateral(a, b, c, new Point(d.getX() + 1, d.getY()));
//        Triangle abc = new Triangle(a, b,c);

        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(5, 5);
        Point d = new Point(0, 5);
        Quadrilateral tttt1 = new Quadrilateral(a, b, c, d);

        Point a2 = new Point(0, 0);
        Point b1 = new Point(0, 10);
        Point c1 = new Point(1, 1);
        Point d1 = new Point(10, 2);
        Quadrilateral tttt = new Quadrilateral(a2, b1, c1, d1);


//
//        System.out.println(new Circle(new Point(sqrt(2) * sqrt(2), 4 - sqrt(2) * sqrt(2)), sqrt(3) * sqrt(3)).isTheSame(new Circle(new Point(2.1, 2), 3)));
//        System.out.println(bcda.isTheSame(badc));
//        System.out.println(bcda.centroid().getX());
//        System.out.println(bcda.centroid().getY());
    }
}
