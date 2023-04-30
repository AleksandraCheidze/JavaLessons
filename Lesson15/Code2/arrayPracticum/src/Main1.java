public class Main1 {
    public static void main(String[] args) {
//        Даны оценки двух учеников за четверть:
//        Ученик1: 5, 3, 3, 4, 5, 4, 5, 5
//        Ученик2: 3, 4, 5, 5, 2, 5, 4
//        Найдите средний балл для каждого ученика и выясните, кто из них лучше учится.*/

        int [] marks1 = new int[8];
        marks1 = new int []{5, 3, 3, 4, 5, 4, 5, 5};

        int [] marks2 = new int[7];
        marks2 = new int []{3, 4, 5, 5, 2, 5, 4};

        int sum1 = 0;
        for (int i = 0; i < marks1.length; i++) {
            sum1 = sum1 + marks1[i];

        }
        int sum2 = 0;
        int j = 0;
        while (j < marks2.length) {
            sum2 = sum2 +marks2 [j];
            j++;
        }
         double average1 = (double) (sum1)/ (double) (marks1.length);
        double average2 = (double) (sum1)/ (double) (marks2.length);

        System.out.println(average1);
        System.out.println(average2);

        if (average1>average2) {
            System.out.println("Pervij uchenik uchitsa luchshe, ego srednij bal: " + average1);
        }else {
            System.out.println("Vtoroj uchenik uchitsa luchshe, ego srednij bal: " + average2);
        }






    }
}
