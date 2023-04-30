import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Array turnover");
        // Запросить длину массива целых чисел у пользователя, занести данные в массив,
        // сделать "разворот" массива (последний элемент должен стать первым и т.д.).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size of array: ");
        int size = scanner.nextInt();

        int[] myArray = new int[size]; // Определили массив

        // Вводим с клавиатуры элементы массива в цикле
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Input" + i + " element of array");
            myArray[i] = scanner.nextInt();
        }

        // Распечатали массив в строчку с разделителем |
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " | ");
        }

        System.out.println(); // переход на новую строку

        // Алгоритм разворота массива
        /*
        - Берем первый элемент массива откладываем его в переменную temp
        - Берем последний элемент массива и переносим в первый
        - В последний элдемент массива нам нужно положить temp
        - Двигаемся слева направо к середине массива
         */

        for (int i = 0; i < myArray.length / 2; i++) {
            int temp = myArray[i]; // Берем первый элемент массива откладываем его в переменную temp (i) потому что начинается с 0
            myArray[i] = myArray[myArray.length-1-i]; // Берем последний элемент массива и переносим в первый // Первый элемент массива = последнему
            myArray[myArray.length-1-i] = temp;
        }

        // Распечатали массив в строчку с разделителем |
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " | ");
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));









    }
}