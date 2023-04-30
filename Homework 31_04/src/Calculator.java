import java.util.Scanner;

public class Calculator {
 // 2. Написать простой калькулятор,  выполняющий сложение, вычитание,
 // умножение и деление в зависимости от ввода пользователем соответствующего действия. Программа
 // принимает два  числа и затем спрашивает какое действие необходимо произвести. Результат выводится на экран
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firs number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter operation");
        String action = sc.next();
        int result = 0;
        switch (action) {
            case "+":
                result = num1 + num2;
                System.out.println("Result is:" + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result is:" + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result is:" + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Result is:" + result);
                break;
            default:
                System.out.println("Invalid operation.Reenter operation");
        }





        }

    }

