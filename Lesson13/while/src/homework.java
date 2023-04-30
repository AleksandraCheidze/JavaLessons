public class homework {
    public static void main(String[] args) {
        //Задача 2. В первый день спортсмен пробежал s километров, а затем он каждый день
        // увеличивал пробег на 10 % от предыдущего значения. Определите номер дня, на который пробег
        // спортсмена составит не менее target километров. Программа
        // получает на вход действительные числа s и target и должна вывести одно натуральное число.

        int s = 7;
        int target = 40;
        double proc = 0.1;
        int days = 0;


        while (s<target)
        {
            double sum = s+(s*proc);
            double sum2 = sum*proc; //vtoroi denj


            s++;
            days++;
        }
        System.out.println(days);
    }
}
