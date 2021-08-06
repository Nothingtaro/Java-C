public class Main {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo() {
        System.out.println("---first run---");
        Person p1 = new Person();
        System.out.println("---second run---");
        Person p2 = new Person();
    }

    public static void demo2() {
        System.out.println(Word.search("Hello"));
        System.out.println(Word.search("toilet"));
        System.out.println(Word.search("water"));
        System.out.println(Word.search("1"));


    }
}
