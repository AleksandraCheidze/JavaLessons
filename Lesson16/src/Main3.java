import java.util.Scanner;
import java.util.Arrays;

public class Main3 {
        public static void main(String[] args) {
        //Задать массив из 10 случайных чисел в интервале от 10 до 100.
            // Пользователь вводит интересующее его число. Определить,
            // есть ли в массиве такое число. Если есть, то указать на каком оно месте.

            int [] numbers = new int[10];
            // zapolnitj massiv sluchainami ciframi
            for (int i = 0; i < numbers.length; i++) {
               numbers [i] = (int) (Math.random() * (100 - 10 - 1) + 10); //sluchainie chisla v intervale ot 10 do 100

            }

            System.out.println(Arrays.toString(numbers));
            Scanner sc = new Scanner(System.in);

            System.out.println("Input number to search in array:");
            int num = sc.nextInt();

            //algoritm - idjem po elementam massiva i sravnivaem ih s num
            boolean isPresent = false;
            int pointer = -1; // net iskomogo elementa v massive
            for (int i = 0; i < numbers.length; i++) {
                if (num == numbers[i]) {

                    isPresent = true;
                    pointer = i;

                }
            }
             if (isPresent) {
                 System.out.println("Element presents, index = " + pointer);
             } else {
                 System.out.println("Element NOT presents");
            }
        }
}
