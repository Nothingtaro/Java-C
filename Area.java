// snippets

public class Area {
  
  public static double rectangle(double width, double height) {
    return width * height;
  }

  public static double triangle(double b, double h) {
    return .5 * b * h;
  }

  public static double circle(double r) {
    return Math.PI * r * r;
  }
  public static void main(String[] args) {
    System.out.println(rectangle(5, 10));
    System.out.println(rectangle(4, 10));
  }

}