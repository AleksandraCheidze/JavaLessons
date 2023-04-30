public class Main {
    public static void main(String[] args) {
        // Определить массив для хранения 10 чисел.
// Заполнить массив целыми числами кратными 10 от 10 до 100.
// Распечатать элементы массива в виде: Element at index 0: значение элемента.
// Сложить все элементы массива и вывести результат.
        //10,20,30,40....,100
        //
        int[] numbers = new int[10]; //objavili massiv na 10 elementov, celie chisla
        int i = 0;
        while (i < 10) {
            numbers[i] = i * 10+10;
            System.out.println("Element at index:" + i + " : " + numbers[i]);
            i++;
        }
        i=0;
        int numbersSum = 0;

        while (i<10) {

            numbersSum = numbersSum + numbers[i];
            i++;
        }
        System.out.println("Summa vseh elementov massiva ravna: " + numbersSum);



        }
    }



