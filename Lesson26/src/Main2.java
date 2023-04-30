import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //Задачи на повторение и закрепление:
        // Задача 1. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        // Первый и второй члены последовательности Фибоначчи равны единицам,
        // а каждый следующий — сумме двух предыдущих. Используйте методы для
        // заполнения Array и ArrayList.


        //создаем массив, который может хранить 20 целочисленных значений
        int[] fibonacci = new int[20];
        //первые два числа последовательности Фибоначчи должны быть  равны 1
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        //Цикл  используется для заполнения массива  числами последовательности Фибоначчи
        // начиная с третьего элемента
        for (int i = 2; i < 20; i++) {
            //следующие числа последовательности,чтобы найти очередное число последовательности
            // Фибоначчи
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]; // предыдущие два числа в последовательности
        }
        //Цикл  используется для вывода на экран содержимого массива
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        //ArrayList
        ArrayList<Integer> fibonacciList = new ArrayList<Integer>();
        fibonacciList.add(1);
        fibonacciList.add(1);
        for (int i = 2; i < 20; i++) {
            fibonacciList.add(fibonacciList.get(i-1) + fibonacciList.get(i-2));
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacciList.get(i) + " ");
        }
    }
}
