import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Задача 1. Написать программу, выводящую на экран максимальное из трех целых чисел.
         Числа должны вводится с клавиатуры.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 different numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b & a>c)
            System.out.println( " maximal number is a = " + a);
        else if (b>a & b>c)
            System.out.println( " maximal number is b = " + b);
        else
            System.out.println( " maximal number is c = " + c);

    }
}