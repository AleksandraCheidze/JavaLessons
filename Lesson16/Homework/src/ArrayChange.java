import java.util.regex.MatchResult;
import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        //Задача 2. Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        // Выведите массив на печать. Поменяйте местами первый и последний элементы массива
        // и снова выведите массив на печать

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (20 - 10 + 1) + 10);
        }
        System.out.println(Arrays.toString(numbers));
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        System.out.println(Arrays.toString(numbers));
    }


    }
