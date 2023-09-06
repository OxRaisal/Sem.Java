import java.time.LocalTime;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        LocalTime now = LocalTime.now();

        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String mask = "%s!%n";
        String morning = "Доброе утро";
        String day = "Добрый день";
        String hello = "";

        if(now.isAfter(LocalTime.of(5,0)) && now.isBefore(LocalTime.of(11, 59))) {
            System.out.printf(mask, morning, name);
            hello = "Доброе утро, ";
        }else if(now.isAfter(LocalTime.of(12,0)) && now.isBefore(LocalTime.of(17, 59))){
            hello = "Добрый день, ";
        }else if(now.isAfter(LocalTime.of(18,0)) && now.isBefore(LocalTime.of(22, 59))) {
            hello = "Добрый вечер, ";
        }else {
            hello = "Доброй ночи, ";
        }

        System.out.printf(mask, hello + name);
    }

    private static void run1() {
        LocalTime now = LocalTime.now();

        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int hour = now.getHour();

        if(hour > 5 && hour < 12) {

        }
    }
}
