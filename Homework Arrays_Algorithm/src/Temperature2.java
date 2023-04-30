public class Temperature2 {
    public static void main(String[] args) {
        //Задача 4 ().* Создать массив, в котором храняться даты и температуры. Вывести
        // на печать таблицу с данными по температуре по дням и среднюю температуру за период наблюдения.

        int[] temperature = new int[7];
        temperature = new int[]{13, 18, 22, 11, 15, 16, 19};
        int sum = 0;
        int i = 0;
        while (i < temperature.length) {
            sum = sum + temperature[i];
            i++;
        }

        double average = (double) (sum) / (double)(temperature.length);
        System.out.println(average);
        String[] days = new String[7];
        days = new String[]{"01.03.", "02.03.", "03.03.", "04.03.", "05.03.", "06.03.", "07.03." };
        System.out.println(days[1]+ " = " + temperature[1]);
        System.out.println(days[2]+ " = " + temperature[2]);
        System.out.println(days[3]+ " = " + temperature[3]);
        System.out.println(days[4]+ " = " + temperature[4]);
        System.out.println(days[5]+ " = " + temperature[5]);
        System.out.println(days[6]+ " = " + temperature[6]);
        System.out.println(days[7]+ " = " + temperature[7]);

    }
}
