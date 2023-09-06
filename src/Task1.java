import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Task1 {
    public static void main(String[] args){
//        System.out.println(x:"Hello");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MM.yyyy г., время: hh ч. mm мин. ss сек.");

        System.out.println(formatter.format(now));
        System.out.println();
        System.out.println(LocalDateTime.now());

    }
}
