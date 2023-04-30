public class WhileMultiplication {
    public static void main(String[] args) {
        //С помощью цикла while написать программу, выводящую на экран
        //результат умножения данного числа n на все целые числа от 0 до n
        int n = 7;
        int result =1;
        int a = 0;
        while (a<=n) {
            result = a * result;
            a++;
        }
        System.out.println(result);


        }

    }

