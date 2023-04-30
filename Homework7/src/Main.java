import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Задача 2. Написать программу , определяющую является ли год високосным.
       Для того, чтобы быть високосным год должен: делится без остатка на 4 и либо
       не должен делится без остатка на 100 либо если он делится на 100, то он должен делится также на 400.
        */
        int year= 1899;
        if (year%4==0 && year%100==0){
                System.out.println("It's a leap year");
        } else if (year%100==0 && year%400==0)
        System.out.println("It's a leap year");
        else
            System.out.println("It's not a leap year");
            }
        }




