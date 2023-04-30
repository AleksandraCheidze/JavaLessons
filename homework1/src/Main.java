import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();
                int sum;
                if (a == b) {
                    sum = 2 * (a + b);
                    System.out.println(sum);
                } else {
                    sum = a + b;
                    System.out.println(sum);
                }
            }
        }






