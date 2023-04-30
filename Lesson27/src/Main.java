import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //prochitatj s klaviaturi chislo i vivesti ego cifri v stolbik, po odnoi v kazhdoi stroke
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input number:");
        int number = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Cifra chisla " + number + " : ");
        int hundreds = number / 100 % 10;
        int tens = number / 10 % 10;
    }
}