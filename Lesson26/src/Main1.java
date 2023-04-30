import java.util.Random;
public class Main1 {

    public static void main(String[] args) {
//Задача 2. Заполнить массив 10 х 10 случайными числами 0 или 1.
// Для каждой строки подсчиать сумму всех элементов массива в этой строке.

        int[][] numbers = new int[10][10]; // создаем двумерный массив размером 10 на 10
        Random random = new Random(); // создаем объект класса Random для генерации случайных чисел

        // заполняем массив случайными числами 0 или 1
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(2); // генерируем случайное число 0 или 1
                    }
                }

        // вычисляем сумму элементов в каждой строке и выводим результат на экран
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0; // счетчик суммы элементов в строке
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j]; // добавляем значение элемента к счетчику
            }
            System.out.println("Сумма элементов в строке " + (i + 1) + ": " + sum);
                }
            }
        }

