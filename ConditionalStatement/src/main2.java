public class main2 {

    public static String stormType(int speed) {
        String stormName = "";
        if (speed < 63) {
            stormName = "Depression";
        } else if (speed >= 63 && speed < 118) {
            stormName = "Tropical storm";
        } else {
            stormName = "Typhoon";
        }
        return stormName;
    }

    public static void main(String[] args) {
        System.out.println(stormType(140));
        System.out.println(stormType(63));
    }
}
