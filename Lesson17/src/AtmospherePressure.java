import java.util.Arrays;
import java.lang.reflect.Array;

public class AtmospherePressure {
    public static void main(String[] args) {
        // Задача 2. Заполнить массив данными наблюдениями атмосферного давления
        // за неделю. Найдите дату, когда было максимальное давление. А когда минимальное?

        int[] pressure = {743, 750, 753, 740, 741, 750, 748};
        String[] dates = {"01.02.", "02.02.", "03.02.", "04.02.", "05.02.", "06.02.", "07.02."};

        int Max = pressure[0];
        int Min = pressure[0];
        int indexMax = pressure[0];
        int indexMin = pressure[0];
        int maxPressure = pressure[0];
        int minPressure = pressure[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < pressure.length; i++) {
            if (pressure[i] > maxPressure) {
                maxPressure = pressure[i];
                maxIndex = i;
            }
            if (pressure[i] < minPressure) {
                minPressure = pressure[i];
                minIndex = i;
            }
        }


        System.out.println("Atmosphere data for week:");
        for (int i = 0; i < pressure.length; i++) {
            System.out.println(dates[i] + ": " + pressure[i] + " mm");
        }
        System.out.println("The maximum pressure was in " + dates[maxIndex] + ": " + maxPressure + " mm");
        System.out.println("The minimum pressure was in " + dates[minIndex] + ": " + minPressure + " mm");
        }
    }


