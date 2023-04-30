import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     //   Задача 1. Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        //   Необходимо определить, сколько будет амёб через n часов, если первоначально
        //   была только одна амёба.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hours: ");
        int n = scanner.nextInt();
        int amoebas = 1;
        for (int i = 0; i < n / 3 ;  i++) {
            amoebas = amoebas * 2;
        }
        System.out.println( "After " + n + " " + "hours " + "will be "  + amoebas +  " " + "amoebas");
    }
}