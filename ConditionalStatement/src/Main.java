public class Main {

    public static boolean testScore(int interviewScore, int englishScore) {
        boolean isOK;
        if (interviewScore > 70 || englishScore > 50) {
            isOK = true;
        } else {
            isOK = false;
        }
        return isOK;
    }

    public static void main(String[] args) {
        System.out.println(testScore(75, 40));
        System.out.println(testScore(75, 60));
        System.out.println(testScore(69, 40));
//        int score = 50;
//        int score;
//        score = 47;
//        if (score >= 50) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("fail");
//        }
//    }
    }
}
