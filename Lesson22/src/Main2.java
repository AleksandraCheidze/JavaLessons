import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество часов: ");
        int x = scan.nextInt();
        int amoebas = 1;
        for (int i = 0; i < x / 3; i++) {
            amoebas = amoebas * 2;
        }
        System.out.println(amoebas);
    }
}