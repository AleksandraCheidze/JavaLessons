import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1. Программа получает на вход строку и число повторений этой строки
        // Программа должна вывести эту строку нужное количество раз.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = scanner.nextLine();
        System.out.println("Input number of repeats: " );
        int repeat = scanner.nextInt();
        int i=0;

        while ( i < repeat ) {
            System.out.println(string);

            i++;
        }

    }
}

