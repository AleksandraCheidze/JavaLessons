import java.util.Arrays;
public class Cube {
    public static void main(String[] args) {
        //Задача 1. Имитация броска 2-мя кубиками с 6 гранями.
        // Использовать двухмерный массив. Бросить 10 раз подряд.
        int [][]result = new int [10][2];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = (int) (Math.random() * (6 - 1 + 1) + 1);


                System.out.print(result[i][j] + " | ");

            }
        }

    }
}
