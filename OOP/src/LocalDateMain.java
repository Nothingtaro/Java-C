import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // today -> instance / object
        System.out.println(today);
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        LocalDate day199 = LocalDate.ofYearDay(2021, 199);
        System.out.println("วันลำดับที่ 199 ของปี 2021 คือ " + day199);

        LocalDate Christmas2021 = LocalDate.of(2021, Month.DECEMBER, 25);
        System.out.println(today.until(Christmas2021, ChronoUnit.DAYS));

        LocalDate birthdate = LocalDate.of(2000, Month.OCTOBER, 29);
        System.out.println(today.until(birthdate, ChronoUnit.DAYS)); // negative
        System.out.println(birthdate.until(today, ChronoUnit.DAYS));

        System.out.printf("อายุ %d ปี %d เดือน %d วัน",
                birthdate.until(today).getYears(),
                birthdate.until(today).getMonths(),
                birthdate.until(today).getDays());
    }
}
