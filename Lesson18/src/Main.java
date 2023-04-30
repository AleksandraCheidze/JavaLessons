import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //vicheslenie chisla v kube
        int n = numberInCube(10);
        System.out.println(n);
        //vicheslenie faktoriala 5! = 1*2*3*4*5 = 120
        int f = factorial(5);
        System.out.println(f);

        //minimum iz dvuh chisel
        int m = min(30, 56);
        System.out.println(m);

        //pechatj stroki n raz
        printStringNTimes("Java is the best language to earn money in programming", 5);

        //sprashivaem imja polzavatelja
        String user;
        user = inputUserName();
        user = nameCorrected(user);
        System.out.println("Hello,  " + user + " !");

        //zapros u polzavatelja vvesti naturalnoe chislo
        int num = inputIntPosNumbers();
        System.out.println(num);
//vijasnjaem , eto prostoe chislo ili net
        if (isPrime(num)) {

            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not prime number.");
        }
        //prodolzhith? yes/no
        if (letsDoItAgain()){
            System.out.println("Great choice! Let's continue...");
        } else {
            System.out.println("Chao!...");
        }


    }


    ///______________________________Mesto dlja metoda__________________
    //metod dlja vicheslenija chisla v kube
    public static int numberInCube(int num) {
        //int res = num * num * num; mozhno tah
        //return res;
        return num * num * num; //mozhno i tak
    }

    //metod vicheslenija faktoriala
    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;

        }
        return res;
    }

    //metod vozvraschaet minimum izdvuh chisel
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    //metod pechataet stroku n raz
    public static void printStringNTimes(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);

        }
    }

    //metod sprashivaet imja polzavatelja i ne dopuskaet pustoe imja polzavatelja
    public static String inputUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User name: ");
        String name = scanner.nextLine();
        while (name.isEmpty()) {
            System.out.println("The name can't be empty.Please try again!");
            name = scanner.nextLine();
        }
        return name;

    }

    //metos korrektiruet imja polzavatelja
    public static String nameCorrected(String name) {
        char firsLetter = name.toUpperCase().charAt(0);
        String name1 = name.substring(1, name.length());
        return firsLetter + name1;

    }

    //metod zaprashivaet naturalnoe chislo u polzavatelja
    public static int inputIntPosNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("The number can't be negative or 0. Pls, try again!");
            n = scanner.nextInt();
        }
        return n;
    }

    //metod proverjaet prostoe chislo ili net
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }


    //metod predlagaet prodolzhitj ili ostanovitsa
    public static boolean letsDoItAgain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue? y/n ");
        String choice = scanner.nextLine();
        boolean res = false;
        while (choice.isEmpty()){
            System.out.println("The choice can't be empty. Pls, try again! ");
            choice = scanner.nextLine();
        }
        if (choice.equals("y")) {
            res = true;
        }else {
            res = false;

        }
        return res;

    }


    //_____________________________konec metoda_____________________
}