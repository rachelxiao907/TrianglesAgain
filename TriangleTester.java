public class TriangleTester {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(0,0,3,0,3,4);
    System.out.println(t1.getPerimeter());
    System.out.println(t1.getArea());
    System.out.println(t1.classify());
    System.out.println(t1);

    Point a = new Point(0,0);
    Point b = new Point(6,0);
    Point c = new Point(3,4);
    Triangle t2 = new Triangle(a,b,c);
    System.out.println(t2.classify());  //isosceles
    System.out.println(t2);
    Triangle t3 = new Triangle(0,0,6,0,3,Math.sqrt(27));
    System.out.println(t3.classify());  //equilateral
    System.out.println(t3);

    Point p1 = new Point(55,6.5);
    t1.setVertex(1,p1);
    System.out.println(t1);
  }
}
