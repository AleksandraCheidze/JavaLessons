import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task2MonthsHomework {
  //    Задание 1
//    Расширьте программу Task2MonthsEnums.
//    Добавьте ещё один enum, который будет описывать времена года (зима, лето, весна, осень).
//     Для введённого пользователем месяца напишите, к какому именно времени года относится выбранный месяц.

  private enum Month {
    JANUARY, // 0
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
  }

  private enum Season{
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN,
  }
  public static void main(String[] args) {
    Map<Month, Season> seasonPerMonth = new HashMap<>();
    seasonPerMonth.put(Month.JANUARY, Season.WINTER);
    seasonPerMonth.put(Month.FEBRUARY, Season.WINTER); // год не високосный
    seasonPerMonth.put(Month.MARCH, Season.SPRING);
    seasonPerMonth.put(Month.APRIL, Season.SPRING);
    seasonPerMonth.put(Month.MAY, Season.SPRING);
    seasonPerMonth.put(Month.JUNE, Season.SUMMER);
    seasonPerMonth.put(Month.JULY, Season.SUMMER);
    seasonPerMonth.put(Month.AUGUST, Season.SUMMER);
    seasonPerMonth.put(Month.SEPTEMBER, Season.AUTUMN);
    seasonPerMonth.put(Month.OCTOBER, Season.AUTUMN);
    seasonPerMonth.put(Month.NOVEMBER, Season.AUTUMN);
    seasonPerMonth.put(Month.DECEMBER, Season.WINTER);


        Map<Month, Integer> daysPerMonth = new HashMap<>();
        daysPerMonth.put(Month.JANUARY, 31);
        daysPerMonth.put(Month.FEBRUARY, 28); // год не високосный
        daysPerMonth.put(Month.MARCH, 31);
        daysPerMonth.put(Month.APRIL, 30);
        daysPerMonth.put(Month.MAY, 31);
        daysPerMonth.put(Month.JUNE, 30);
        daysPerMonth.put(Month.JULY, 31);
        daysPerMonth.put(Month.AUGUST, 31);
        daysPerMonth.put(Month.SEPTEMBER, 30);
        daysPerMonth.put(Month.OCTOBER, 31);
        daysPerMonth.put(Month.NOVEMBER, 30);
        daysPerMonth.put(Month.DECEMBER, 31);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = scanner.next(); // месяц "как ввели"
        // enum.valueOf("ЗНАЧЕНИЕ") либо вернёт нам соответствующее значение по его названию,
        // либо выбросит исключение IllegalArgumentException
        Month monthKey = Month.valueOf(month.toUpperCase());// месяц "как ключ словаря"
        // enum.ordinal() возвращает индекс значения в перечислении
        Season season = seasonPerMonth.get(monthKey); //получаем ключ season
        System.out.println(month + " has " + daysPerMonth.get(monthKey) + " days" +  " "+ "and season is " + season);


        int nextMonthIndex = (monthKey.ordinal() + 1) % Month.values().length;
        Month nextMonth = Month.values()[nextMonthIndex];
        System.out.println(
            "The next month " + nextMonth + " has " + daysPerMonth.get(nextMonth) + " days");
        System.out.println();

        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt(); // порядковый номер месяца
        // enum.valueOf("ЗНАЧЕНИЕ") либо вернёт нам соответствующее значение по его названию,
        // либо выбросит исключение IllegalArgumentException
        int monthIndex = monthNumber - 1; // индекс месяца в перечислении
        monthKey = Month.values()[monthIndex]; // месяц "как ключ словаря"
        // при выводе вызовется enum.toString(), который выдаст название значения в виде строки
        System.out.println(monthKey + " has " + daysPerMonth.get(monthKey) + " days" );
        System.out.println();

        System.out.println("=== Перебор через Month.values() ===");
        // enum.values() - это массив всех значений в порядке их описания
        // Month.values() вернёт нам Month[]
        for (Month key : Month.values()) {
          // перебираем ключи, по каждому ключу получаем значение через get
          // при выводе enum превращается в строку - название значения
          System.out.println(key + ": " + daysPerMonth.get(key));
        }
    // метод для определения времени года, к которому относится месяц


  }
    }
