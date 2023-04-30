public class Algorithm {
    public static void main(String[] args) {
        // // Что на входе: задать одно натуральное число - цена за услугу
        // // Что на выходе: количество монет
        // // задать значение переменным - номинал монет
        // // Задать цикл - выявить количество монет от цены
        // // Выводим количество монет в сумме


         int sum = 25;
         int coin1 = 1;
         int coin2 = 5;
         int coin3 = 10;
         int coin4= 25;
         while (sum>=coin4){
             sum=sum-coin4;
             coin1--;}
         while (sum>=coin3){
             sum=sum-coin3;
             coin2--;}
        while (sum>=coin2){
            sum=sum-coin2;
            coin3--;}
        while (sum>=coin1){
            sum=sum-coin1;
            coin4--;}

        System.out.println(coin1+coin2+coin4+coin4);

         }

    }
