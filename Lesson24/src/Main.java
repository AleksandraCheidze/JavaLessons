import java.util.HashSet;
import java.util.Scanner;
import  java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        Задача 2. Написать программу, которая:
//
//        прочитает с клавиатуры количество вводимых чисел,
//        прочитает с клавиатуры сами числа и соберёт их в множество,
//        удалить из множества числа, большие 10 (здесь надо подумать!) выведет полученные результаты на экран
//        Все числа, которые подаются на вход, целые.
//                Алгоритм:
//Шаг 1 - просим пользователя ввести кол-во чисел
//Шаг 2 - запускаем цикл в котором считываем число и коадем его в HashSet
//Шаг 3 - нужно "обойти", "пербрать" все элементы множества и сравнить их с 10 (больше или меньше)
//Шаг 4 - отложить удаляемые числа в отдельный Set
//Шаг 5 - выполнить удаление
//Шаг 6 - распечатать остаток множества

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of set");//priglashenie polzavatelja
        int numElements = scanner.nextInt();//kolichestvo vvodimih chisel - elementov mnozhestva

        HashSet<Integer>numbers = new HashSet<>();//iniciiruem mnozhestva
        //schitivaem i dobavljaem elementi mnozhestva
        for (int i = 0; i < numElements; i++) {
            System.out.println("Input integer numbers");
            numbers.add((scanner.nextInt()));

        }
        //pechataem mnozhestvo
        System.out.println(numbers);

        //zdesj budut chisla, kototrie mi hotim udalitj
        HashSet<Integer>numbersToRemove = new HashSet<>();
        //ispolzuem cikl for each
        for (int n : numbers){
            if (n > 10){
                numbersToRemove.add(n);

            }
        }
        System.out.println(numbersToRemove);
        for (int n : numbersToRemove){
            numbers.remove(n);

        }
        System.out.println(numbers);

   }
}