public class test {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        sum();
        int n = 4;
        int Fact = factorial(n);
        System.out.println(n + "! = " + Fact);
        System.out.println(fib(n));

    }

    public static void sum() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println("total sum = " + total);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public static int fibsequence(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return n;
    }
}
