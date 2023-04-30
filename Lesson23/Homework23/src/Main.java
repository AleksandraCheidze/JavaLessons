import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Задача 1. Написать программу, которая:
//        прочитает с клавиатуры количество вводимых названий земель в Германии,
//                прочитает с клавиатуры названия земель и соберёт их в множество,
//                выведет полученные результаты на экран.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the amount of lands in Germany: ");
        int count = scanner.nextInt();


        HashSet<String> landNames = new HashSet<>();


        for (int i = 0; i < count; i++) {
            System.out.print("Input land name" + (i + 1) + ": ");
            String landName = scanner.next();
            landNames.add(landName);
        }


        System.out.println("Land names in Germany:" + landNames);


        }
    }

