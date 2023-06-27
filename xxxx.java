package Test05;

public class Quadrilateral extends Figure {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (b == null || a == null || c == null || d == null)
            throw new IllegalArgumentException("Triangle is degenerative");

        double sideAB = a.distanceTo(b);
        double sideAC = a.distanceTo(c);
        double sideBC = b.distanceTo(c);
        double sideDC = d.distanceTo(c);
        double sideDA = d.distanceTo(a);
        double s1 = (sideAB + sideAC + sideBC) / 2;
        double s2 = (sideAC + sideDC + sideDA) / 2;
        double firstAreaTriangle = Math.sqrt(s1 * (s1 - sideAB) * (s1 - sideAC) * (s1 - sideBC));
        double secondAreaTriangle = Math.sqrt(s2 * (s2 - sideDA) * (s2 - sideAC) * (s2 - sideDC));

        if (firstAreaTriangle == secondAreaTriangle) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        } else if (firstAreaTriangle == 0 | secondAreaTriangle == 0) {
            throw new IllegalArgumentException("Triangle is degenerative");
        }

    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public Point getD() {
        return d;
    }

    @Override
    public Point centroid() {

        double x1 = (((a.getX() + b.getX() + c.getX()) / 3));
        double y1 = (((a.getY() + b.getY() + c.getY()) / 3));
        Point triangle1 = new Point(x1, y1);

        double x2 = (((a.getX() + d.getX() + c.getX()) / 3));
        double y2 = (((a.getY() + d.getY() + c.getY()) / 3));
        Point triangle2 = new Point(x1, y1);

        double x3 = (((a.getX() + b.getX() + d.getX()) / 3));
        double y3 = (((a.getY() + b.getY() + d.getY()) / 3));
        Point triangle3 = new Point(x3, y3);

        double x4 = (((c.getX() + b.getX() + d.getX()) / 3));
        double y4 = (((c.getY() + b.getY() + d.getY()) / 3));
        Point triangle4 = new Point(x4, y4);

        double d, dy, dx, a1, b1, c1, a2, b2, c2, xx1, xx2, xx3, xx4, yy1, yy2, yy3, yy4, xx, yy, f, f1;
        xx1 = triangle1.getX();
        yy1 = triangle1.getY();
        xx2 = triangle2.getX();
        yy2 = triangle2.getY();
        xx3 = triangle3.getX();
        yy3 = triangle3.getY();
        xx4 = triangle4.getX();
        yy4 = triangle4.getY();
        if (xx2 == xx3 && yy2 == yy3) return null;
        a1 = yy1 - yy2;
        b1 = xx2 - xx1;
        c1 = xx1 * yy2 - xx2 * yy1;
        a2 = yy3 - yy4;
        b2 = xx4 - xx3;
        c2 = xx3 * yy4 - xx4 * yy3;
        d = a1 * b2 - b1 * a2;
        f = a1 + b2;
        if (a1 == a2 || d == 1 || (f) == 0) {
            return null;
        } else {
            dx = -c1 * b2 + b1 * c2;
            dy = -a1 * c2 + c1 * a2;

            xx = dx / d;
            yy = dy / d;

        }
        Point result = new Point(xx, yy);
        return result;

    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Quadrilateral) {
            double sideAB = a.distanceTo(b);
            double sideAC = a.distanceTo(c);
            double sideBC = b.distanceTo(c);
            double sideDC = d.distanceTo(c);
            double sideDA = d.distanceTo(a);
            double s1 = (sideAB + sideAC + sideBC) / 2;
            double s2 = (sideAC + sideDC + sideDA) / 2;
            double firstAreaTriangle = Math.sqrt(s1 * (s1 - sideAB) * (s1 - sideAC) * (s1 - sideBC));
            double secondAreaTriangle = Math.sqrt(s2 * (s2 - sideDA) * (s2 - sideAC) * (s2 - sideDC));

            double sideAB1 = ((Quadrilateral) figure).getA().distanceTo(((Quadrilateral) figure).getB());
            double sideAC1 = ((Quadrilateral) figure).getA().distanceTo(((Quadrilateral) figure).b);
            double sideBC1 = ((Quadrilateral) figure).getB().distanceTo(((Quadrilateral) figure).getC());
            double sideDC1 = ((Quadrilateral) figure).getD().distanceTo(((Quadrilateral) figure).getC());
            double sideDA1 = ((Quadrilateral) figure).getD().distanceTo(((Quadrilateral) figure).getA());
            double ss1 = (sideAB1 + sideAC1 + sideBC1) / 2;
            double ss2 = (sideAC1 + sideDC1 + sideDA1) / 2;
            double firstAreaTriangle1 = Math.sqrt(ss1 * (ss1 - sideAB1) * (ss1 - sideAC1) * (ss1 - sideBC1));
            double secondAreaTriangle2 = Math.sqrt(ss2 * (ss2 - sideDA1) * (ss2 - sideAC1) * (ss2 - sideDC1));
            if (firstAreaTriangle == secondAreaTriangle & firstAreaTriangle1 == secondAreaTriangle2) {
                return true;
            } else {
                return false;
            }
        } else return false;


    }
}

