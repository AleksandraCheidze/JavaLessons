public class MaxElement {
    public static void main(String[] args) {
        // Задача 1. Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        //  Найдите максимальный элемент массива и его индекс.

        int []arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int numMax = arr[0];
        int indexMax = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]> numMax) {
                numMax = arr[1];
                indexMax = i;

            }

        }
        System.out.println("Maximal element: " + numMax);
        System.out.println("Index of maximal element: " + indexMax);


        }
    }

