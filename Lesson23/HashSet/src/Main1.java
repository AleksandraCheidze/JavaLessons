import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Post code");
        //**Задача:** Написать приложение, которое позволит понять,
        // из каких мест на данную почту приходят письма.
        // Что на входе: поступают письма, на письмах есть почтовые индексы
        // Что будем вводить? - организуем рабочее место где оператор быдет вводить эти индексы
        // Что на выходе? - список индексов, откуда пришла почта.
        // Возможно проверка - а было ли письмо (индекс) уже введен?
        // Все письма имеют индекс отправителя
        // Ключевой алгоритм - просим пользователя ввести индекс, добавляем индексы в HashSet
        // В конце смены - распечатаь HashSet

        Scanner scanner = new Scanner(System.in);
        HashSet<String> postCodes = new HashSet<>();
        char userChoice;

        do {
            System.out.println("Input post code: ");
            String postCode = "";

            postCode = scanner.next();

            if (postCodes.add(postCode)) {
                System.out.println("Post code added");
            } else {
                System.out.println("This post code already exists");
            }
            // Интерфейс продолжения работы
            System.out.println("Для для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = scanner.next().toLowerCase().charAt(0); // имя_сканера.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}

        } while (true);

        System.out.println("Inputed post codes:");
        System.out.println(postCodes);

    }
}