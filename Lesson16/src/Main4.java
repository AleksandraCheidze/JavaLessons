import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        //  Задан массив целых чисел: 46, 13, 1, 10, 67, -4, 20, 56, 11, 35.
        //  Выполнить сортировку массива от меньшего к большему.


        // Алгоритм:
        // проходим по массиву от его начала до конца (слева на право),
        // если найдем минимальный элемент меньше текущего, то поставим его на место текущего,
        // затем сдвигаемся к следующему элементу и опять ищем минимальный из оставшихся.
        // То есть минимальные элементы "всплывают" к началу массива.

        int[] numbers = {46, 13, 1, 10, 67, -4, 20, 56, 11, 35};
        int min, indexOfMin;

        for (int i = 0; i < numbers.length; i++) { //проходим по массиву от его начала до конца (слева на право),
            min = numbers[i];
            indexOfMin = i;
            //probegEM VSE ELEMENTI MASSIVA s pravo ot tekuschego
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            int temp = numbers[i]; //zabrali v temp levij element
            numbers[i] = numbers[indexOfMin]; //na ego mesto postavili naidenij minimalnij
            numbers[indexOfMin] = temp;// naa mesto minimalnogo postavili levij krainij element
            System.out.println(Arrays.toString(numbers)); //napechatali massiv
        }
        }
    }
















