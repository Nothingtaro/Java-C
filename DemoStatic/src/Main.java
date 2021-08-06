import jdk.jshell.execution.Util;

import java.net.URI;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // static method
//        Math m = new Math();
//        m.pow(2.0, 10.0);
        System.out.println(Math.pow(2.0, 10.0)); // Math -> class, pow -> static method
        // สามารถเรียกผ่านจากตัว class ได้ทันที ไม่ต้องสร้าง instance ของ class ขึ้นมา -> static method

        System.out.println(Utils.capitalizedFirstChar("banGkOK")); // -> use static method

//        Utils u = new Utils();
//        System.out.println(u.capitalizedFirstChar("thAiLaND"));

        System.out.println(Utils.removeAllNonNumeric("asdfh123-/EWRF#2@@"));

        System.out.println(Utils.vatRate);

    }

}
