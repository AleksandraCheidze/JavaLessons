import java.util.Scanner;

public class Zadacha2 {
   /* Задача 2.
    Используя тернарный оператор написать программу,которая принимает с
    клавиатуры два целых числа , затем записывает значение меньшего из них в
    переменную min и выводит ее на экран.
    */
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Input first number");
      int num1 = sc.nextInt();
      System.out.println("Input second number");
      int num2 = sc.nextInt();
      int min = num1>num2 ? num1:num2;
      System.out.println(min);

   }
}
