import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Задача 2. (*) Извлечение квадратного корня - проверка данного числа на входе.
        //  Число вводится пользователем с клавиатуры.
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number");
        double a= sc.nextDouble();
          if (a>0) {
              System.out.println("Square root of " + a + " is " + Math.sqrt(a));
          } else {
              System.out.println("Number is not valid");

              }
          }
    }
