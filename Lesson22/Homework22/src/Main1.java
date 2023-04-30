public class Main1 {
    public static void main(String[] args) {
        // Задача 2. На столе лежат n монеток. Некоторые из них лежат вверх решкой,
        // а некоторые – гербом. Определите минимальное число монеток, которые нужно
        // перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной.
        int tailSide = 0;
        int headSide = 0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            int coin = (int)(Math.random() * (1 - 0 + 1) + 0);
            if (coin == 0) {
                tailSide++;
            } else headSide++;

            }
        System.out.println(Math.min(tailSide,headSide));

        }


    }
