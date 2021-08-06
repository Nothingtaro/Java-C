public class DiceMain {

    public static void demoDiceV1() {
        long start = System.currentTimeMillis();
        Dice adice = new Dice();
        for (int i = 0; i < 10000; i++) {
            System.out.println(adice.roll());
        }
        long stop = System.currentTimeMillis();
        System.out.printf("elapsed time = %d" , stop - start);
        // aDice.getFreqs() = 20;
//        for (int i = 0; i < adice.getFreqs().length; i++) {
//            System.out.printf("face %d occurs %d times\n", i + 1, adice.getFreqs()[i]);
//        }
    }

    public static void demoDiceV2() {
        long start = System.currentTimeMillis();
        DiceV2 adice = new DiceV2();
        for (int i = 0; i < 10000; i++) {
            System.out.println(adice.roll());
        }
        long stop = System.currentTimeMillis();
        System.out.printf("elapsed time = %d\n" , stop - start);
        adice.showFreqs();

        // aDice.getFreqs() = 20;
//        for (int i = 0; i < adice.getFreqs().length; i++) {
//            System.out.printf("face %d occurs %d times\n", i + 1, adice.getFreqs()[i]);
//        }
    }

    public static void main(String[] args) {
//        demoDiceV2();
//        System.out.println("\u2680\u2685");
        DiceV2 d = new DiceV2();
        for (int i = 0; i < 10; i++) {
            System.out.println(DiceV2.numberToFace(d.roll()));
//            d.roll();
//            System.out.println(d.getDiceFace());
        }

    }

}
