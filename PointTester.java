public class PointTester {
  public static void main(String[] args) {
    Point p1 = new Point(1.5,9.1);
    System.out.println(p1.getX());  //1.5
    System.out.println(p1.getY());  //9.1
    Point p2 = new Point(p1);
    System.out.println(p2.getX());  //1.5
    System.out.println(p2.getY());  //9.1

    Point p3 = new Point(0,0);
    Point p4 = new Point(3,4);
    System.out.println(p4.distanceTo(p3));  //5.0
    System.out.println(p4.equals(p3));  //false
    System.out.println(p1.equals(p2));  //true
  }
}
