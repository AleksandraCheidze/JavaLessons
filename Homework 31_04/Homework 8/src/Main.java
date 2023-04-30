import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1.
        //Написать программу, которая принимает с
        // клавиатуры номер месяца и год и выводит на экран название месяца и количество дней в нем.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number of a month ");
        int mon = sc.nextInt();
        System.out.println("You entered the number of the month: "  + mon);
        System.out.println("Please enter a year");
        int year = sc.nextInt();
        System.out.println("You entered the year: " + year);

       switch (mon) {
           case 1:
               System.out.println("January, 31 days");
               break;
           case 2:
               System.out.println((year%4==0 && year%100!=0 || year%400==0)?"February, 29 days" : "February 28 days");

               break;
           case 3:
               System.out.println("March, 31 days");
               break;
           case 4:
               System.out.println("April, 30 days");
               break;
           case 5:
               System.out.println("May, 31 days");
               break;
           case 6:
               System.out.println("June, 30 days");
               break;
           case 7:
               System.out.println("July, 31 days");
               break;
           case 8:
               System.out.println("August, 31 days");
               break;
           case 9:
           System.out.println ("September, 30 days");
           break;
           case 10:
           System.out.println("October, 31 days");
           break;
           case 11:
           System.out.println("November, 30 days");
           break;
           case 12:
           System.out.println("December, 31 days");
           default:
               System.out.println("Not exist");
       }






        }



    }
