import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main2 {
        public static void main(String[] args) {
            // Задача 2. Напишите программу, которая:
            //
            //прочитает размер списка (ArrayList) косметических брендов (можно и другие бренды)
            //прочитает элементы списка с клавиатуры
            //выведет список на печать
            //"перевернёт" элементы (поменяет местами первый с последним, второй с предпоследним и т.д.)
            //выведет изменённый список



          Scanner scanner = new Scanner(System.in);
            System.out.println("Input cosmetic brands list number");
            int length = scanner.nextInt();
            scanner.nextLine();

            ArrayList<String>cosmeticBrands = new ArrayList<String>();

            System.out.println("Input cosmetic brands names");
            for (int i = 0; i < length; i++) {
                System.out.print("Brand " + (i + 1) + ": ");
                String brandName = scanner.nextLine();
                cosmeticBrands.add(brandName);

            }
            System.out.println("Cosmetic brands list: " + " " + cosmeticBrands);
            for (int i = 0; i < length / 2; i++) {
                String newPosition = cosmeticBrands.get(i);
                cosmeticBrands.set(i, cosmeticBrands.get(length - i - 1));
                cosmeticBrands.set(length- i - 1, newPosition);
            }
            System.out.println("New positions: " + " " + cosmeticBrands);



        }
    }


