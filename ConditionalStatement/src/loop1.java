public class loop1 {
    public static void demo1() {
//        int i;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println("--");
        }
        System.out.println("BYE");
    }

    public static void demo2() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            System.out.println("--");
        }
        System.out.println("BYE");
    }

    public static void sum1() {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total = total + i;
        }
        System.out.println(total);
    }

    public static int sum(int fromNum, int toNum) {
        int total = 0;
        for (int i = fromNum; i <= toNum; i++) {
            total = total + i;
        }
        return total;
    }

    public static void MultiplicationTable(int n) {
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

    public static void printChar() {
        for (char c = 'A'; c <= 'Z' ; c++) {
            System.out.printf("%c", c);
        }
    }

    public static void printChar2() {
        for (int c = 65; c <= 90 ; c++) {
            System.out.printf("%d --> %c\n", c, (char)c);
        }
    }

    public static void printCharBetter(char FromCh, char ToCh) {
        for (char c = FromCh; c <= ToCh ; c++) {
            System.out.printf("%d %04X %c\n", (int)c, (int)c, c);
        }
    }

    public static void main(String args[]) {
//        demo1();
//        demo2();
//        sum1();
//        System.out.println(sum(1,100));
//        MultiplicationTable(5);
//        printChar();
//        printChar2();
//        printCharBetter('J', 'Z');
        printCharBetter('ก', 'ฮ');
    }

}


