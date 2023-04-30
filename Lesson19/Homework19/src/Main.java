import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Break and Continue examples");

//      Вводится натуральное число n с клавиатуры. Подсчитать сумму всех натуральных чисел меньших n,
//      за исключением чисел, кратных числу 3.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}