public class Main {

    public static void main(String[] args) {
        demo4();
    }

    public static void demo() {
        Person p1 = new Person();
        p1.setFirstName("Peter");
        p1.setLastName("Parker");
        p1.setGender("M");
        p1.setNickName("Pete");
    }

    public static void demo2() {
        Person p2 = new Person("peTEr", "Parker", "Pete", "M");
        System.out.println(p2.getFirstName());

    }

    public static void demo3() {
        Person p3 = new Person("peTER", "pete");
        System.out.println(p3.getFirstName());
        p3.setFirstName("abCDeF");
        System.out.println(p3.getFirstName());
    }

    public static void demo4() {
        Patient t = new Patient();
        // output : Person constructor was called.
        /* if we don't determine a constructor in child class, it will call a constructor
         from parent class instead. */

        Patient t2 = new Patient("Peter", "Parker",
                "M", "Pete", 170f, 70f);
//        System.out.println(t2.getFirstName() + " " + t2.getLastName() +
//                " height = " + t2.getHeight());

        System.out.println(t2.toString());
    }
}
