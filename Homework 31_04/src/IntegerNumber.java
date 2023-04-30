import java.util.Scanner;

public class IntegerNumber {
    //3. Написать программу, читающую с экрана целое число и выводящее на экран количество цифр в нем.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int a = sc.nextInt();
        int length = String.valueOf(a).length();
        System.out.println(length);
    }
}
