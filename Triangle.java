public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3) {
    Point a = new Point(x1, y1);
    Point b = new Point(x2, y2);
    Point c = new Point(x3, y3);
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public double getPerimeter() {
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
  }

  public double getArea() {
    double d1 = v1.distanceTo(v2);
    double d2 = v1.distanceTo(v3);
    double d3 = v2.distanceTo(v3);
    double S = getPerimeter() / 2;
    return Math.sqrt(S * (S - d1) * (S - d2) * (S - d3));
  }
}
