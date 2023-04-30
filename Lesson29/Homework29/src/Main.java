import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    //защищаем

//    Задача 1
//    Напишите программу, которая:
//
//    прочитает целое число из файла res/in.txt
//    переведёт его в двоичную запись
//    запишет его в файл res/out.txt
//    Воспользуйтесь методом decToBin(int number) из задачи 1 предыдущего урока или информацией из разбора домашнего задания.

    File file = new File("res/in.txt"); //создаем объект с информацией о файле
    Scanner scanner = new Scanner(new File("res/in.txt"));//считываем  файл
    int a = scanner.nextInt();
    System.out.println("целое число из файла: " + a);//выводим информацию из файла

    String binNumber = decToBin(a); // переводим в бинарную
    System.out.println("Число " + a + " в системе счисления с основанием 2: " + binNumber);//выводим

    FileWriter outputFileWriter = new FileWriter("res/out.txt");//создаем объект для записи в файл
    outputFileWriter.write(a);//записываем в файл
    outputFileWriter.close();//закрываем


  }

  public static String decToBin(int number) {
    final int radix = 2;
    if (number == 0) {
      return "0";
    }

    StringBuilder result = new StringBuilder();
    boolean isNegative = number < 0;
    if (isNegative) {
      number = Math.abs(number);
    }

    while (number > 0) {
      result.insert(0, number % radix);
      number /= radix;
    }
    if (isNegative) {
      result.insert(0, "-");
    }

    return result.toString();
  }




}