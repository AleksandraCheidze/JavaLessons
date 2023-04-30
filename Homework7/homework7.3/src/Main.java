import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 3. (*) Вычислить 3-й угол треугольника, проверка данных на входе.
        // Сумма углов тр-ка = 180.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first angle");
        int a = sc.nextInt();
        System.out.println("Input the second angle");
        int b = sc.nextInt();
        if (a+b<180){
            System.out.println("Third corner of triangle is " + (180-(a+b)));
        } else {
            System.out.println("Number is not valid");
        }
    }
}




