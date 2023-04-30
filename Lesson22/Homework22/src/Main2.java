public class Main2 {
    public static void main(String[] args) {

       // Задача 3 (*). Среди 10 человек был проведен опрос:
        // "Если у вас есть шоколадка, вы поделитесь с грустным незнакомцем на улице?"
        // Ответ 1 означает да, поделится. Ответ 2 означает нет, не поделится. Давайте
        // посчитаем, сколько процентов опрошенных добрые и щедрые люди, делящиеся
        // шоколадом с незнакомцами. Ответ в процентах выведите на экран.
        int people = 10;
        int yes = 0;
        int no = 0;
        for (int i = 0; i < people; i++) {
            int goodPeople = (int) (Math.random() * 2);
            if (goodPeople==0) {
                yes++;
            }else no++;
            }
        double percentage = ((double) yes * 100) / people;
        System.out.println(percentage + "%");



        }
    }

