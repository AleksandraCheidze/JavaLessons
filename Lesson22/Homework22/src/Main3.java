import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //Задача 4 (*). Конвертор температур, зациклено и защищено от неправильного ввода.


        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Please, input temperature in Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("What degrees are we converting to? If in Fahrenheit, press - 1, if in Kelvin, press - 2, to exit press - 0");
            int degree = scanner.nextInt();
            String degreeString;
            double convertedTemperature = 0;

            switch (degree) {
                case 1:
                    convertedTemperature = c * 1.8 + 32;
                    degreeString = convertedTemperature + " " + "Fahrenheit";
                    break;
                case 2:
                    convertedTemperature = c + 273.15;
                    degreeString = convertedTemperature + " " + "Kelvin";
                    break;
                case 0:
                    exit = true;
                    degreeString = "Exiting...";
                    break;
                default:
                    degreeString = "Invalid number";
            }
            System.out.println(degreeString);
        }
    }
}










