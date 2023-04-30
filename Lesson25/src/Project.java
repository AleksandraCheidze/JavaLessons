//import java.util.Scanner;
//import java.util.HashMap;
//
//public class Project {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // Шаг 1: 1. Прописываем курс и вид валют в HashMap
//        HashMap<String, Double> currencyRates = new HashMap<>();
//        currencyRates.put("1. USD", 1.10);
//        currencyRates.put("2. EUR", 1.00);
//        currencyRates.put("3. GBP", 0.88);
//        currencyRates.put("4. JPY", 147.68);
//        currencyRates.put("5. UAH", 40.46);
//        //Шаг 2. Предлагаем пользователю посмотреть список валют и их курсы
//
////            System.out.println("Доступные валюты и их курсы:");
////            for (String currencyCode : currencyRates.keySet()) {
////                System.out.printf("%s: %.2f\n", currencyCode, currencyRates.get(currencyCode));
////            }
//        printCurrency(currencyRates);
//
//            // Шаг 3: Предлагаем пользователю продолжить или закончить
//            System.out.println("Continue? y/n ");
//            String userChoice = scanner.next();
//            if (userChoice.equals("n")) {
//                System.out.println("Thanks you! Goodbye!");
//            } else {
//                // 4.Предлагаем выбрать из 5 предложенных вариантов исходную валюту
//                // 6. Проверяем ввел ли юзер правильную цифру
//                printCurrency(currencyRates);
//                System.out.println("Выберите исходную валюту(введите цифру):");
//                int choice = scanner.nextInt();
//                String targetCurrency = "";
//                int i = 1;
//                for (String currency : currencyRates.keySet()) {
//                    System.out.println();
//                    if (i == choice) {
//                        targetCurrency = currency;
//                        break;
//                    }
//                    i++;
//                }
//                }
//                    System.out.println("Неверный выбор");
//
//
//                    // 5. Предлагаем  выбрать из 5 предложеных вариантов целевой валюты
//                    // 6. Проверяем ввел ли юзер правильную цифру
//                     printCurrency(currencyRates);
//                    System.out.println("Выберите целевую валюту(введите цифру):");
//                    int choice2 = scanner.nextInt();
//                    String targetCurrency = "";
//                    int i = 1;
//                    for (String currency2 : currencyRates.keySet()) {
//                        if (i == choice2) {
//                            targetCurrency = currency2;
//                            break;
//                        }
//                        i++;
//                    }
//
//
//
//
//
//
//                }
//                public static void printCurrency (HashMap<String, Double> curRate){
//                    System.out.println("Доступные валюты и их курсы:");
//                    for (String currencyCode : curRate.keySet()) {
//                        System.out.printf("%s: %.2f\n", currencyCode, curRate.get(currencyCode));
//                    }
//                }
//
//
//
//
//                }

//
//import java.util.Scanner;
//        import java.util.HashMap;
//
//public class Project {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // Шаг 1: 1. Прописываем курс и вид валют в HashMap
//        HashMap<String, Double> currencyRates = new HashMap<>();
//        currencyRates.put("USD", 1.10);
//        currencyRates.put("EUR", 1.00);
//        currencyRates.put("GBP", 0.88);
//        currencyRates.put("JPY", 147.68);
//        currencyRates.put("UAH", 40.46);
//        //Шаг 2. Предлагаем пользователю посмотреть список валют и их курсы
//        System.out.println("Доступные валюты и их курсы:");
//        for (String currencyCode : currencyRates.keySet()) {
//            System.out.printf("%s: %.2f\n", currencyCode, currencyRates.get(currencyCode));
//        }
//        // Шаг 3: Предлагаем пользователю продолжить или закончить
//        System.out.println("Continue? y/n ");
//        String userChoice = scanner.next();
//        if (userChoice.equals("n")) {
//            System.out.println("Thanks you! Goodbye!");
//        } else {
//            // 4.Предлагаем выбрать из 5 предложенных вариантов исходную валюту
//            int choice1;
//            System.out.println("Выберите исходную валюту(введите цифру):");
//            int count = 1;
//            for (String currencyCode : currencyRates.keySet()) {
//                System.out.println(count + ". " + currencyCode);
//                count++; //pronomeroval
//            }
//
//            choice1 = scanner.nextInt();
//            // 6. Проверяем ввел ли юзер правильную цифру
//            if (choice1 < 1 || choice1 > currencyRates.size()) {
//                System.out.println("Неверный выбор");
//            } else {
//                // 5. Предлагаем  выбрать из 5 предложеных вариантов целевой валюты
//                System.out.println("Выберите целевую валюту(введите цифру):");
//                count = 1;
//                for (String currencyCode : currencyRates.keySet()) {
//                    System.out.println(count + ". " + currencyCode);
//                    count++;
//                }
//                int choice2 = scanner.nextInt();
//                // 6. Проверяем ввел ли юзер правильную цифру
//                if (choice2 < 1 || choice2 > currencyRates.size() || choice2 == choice1) {
//                    System.out.println("Неверный выбор");
//                } else {
//                    // 7. Уточняем сумму и.в. и информируем о возможности введения суммы с 2 знаками после запятой
//
//
//                }
//            }
//        }
//    }
//}












