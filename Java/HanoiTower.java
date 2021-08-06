package Java;

public class HanoiTower {
  public static void main(String[] args) {
    hanoi(5, "A", "B", "C");
  }

  public static void hanoi(int n, String a, String b, String c) {
    if (n == 0) return;
    hanoi(n-1, a, c, b);
    System.out.println(" move plate " + n + " from " + a + " to " + c);
    hanoi(n-1, b, a, c);
  }
  
}
