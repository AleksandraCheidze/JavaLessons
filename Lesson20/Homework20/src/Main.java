import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //      Задача 1. Расчет периметра прямоугольника, защита от ввода символов вместо числа и
        //      ввода отрицательных чисел. Запросить у пользователя длину и ширину прямоугольника.


        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (true) {
            try {
                System.out.println("Input rectangle length: ");
                double l = scanner.nextDouble();
                System.out.println("Input rectangle width: ");
                double w = scanner.nextDouble();
                if (l <= 0 & w <= 0) {
                    System.out.println("Please input positive numbers");
                }else {
                double p = perimeter(l, w);
                System.out.println("Perimeter of rectangle: " + p);}

            } catch (InputMismatchException error) {
                System.out.println("Please input only numbers" + error.getMessage());}
                System.out.println("Continue? y/n ");
                choice = scanner.next();
                if (choice.equals("n")) {
                    System.out.println("Thanks! Bye-bye...");
                    break;



            }
        }


    }
    public static double perimeter (double l, double w) {
        return 2*(l*w);
    }
}