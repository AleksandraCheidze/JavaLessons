
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;



public class Main {
    public static void main(String[] args) {
        //Задача 1. Имеются результаты забега на 100 метров группы бегунов из 10 участников.
        // Внести эти результаты в компьютер согласно протоколу. Отсортировать результаты,
        // напечатать кто занял 1-е и кто занял последнее место. Используйте HashMap для хранения
        // результатов забега и ArrayList для сортировки.

        // Создаем HashMap для хранения результатов забега
        HashMap<String, Double> results = new HashMap<>();
        results.put("Mark", 10.5 );
        results.put("Lisa", 9.8 );
        results.put("Tom", 8.7);
        results.put("Jon", 11.7 );
        results.put("Peter", 11.1 );
        results.put("Anna", 12.3 );
        results.put("Klara", 8.8 );
        results.put("Sasha", 9.3);
        results.put("Vera", 9.7 );
        results.put("Maik", 10.2 );

        ArrayList<Map.Entry<String, Double>> sortedResults = new ArrayList<>(results.entrySet());//создаем объект ArrayList,
        // который содержит элементы типа Map.Entry<String, Double>, то есть пары ключ-значение из HashMap

        sortedResults.sort(Map.Entry.comparingByValue());// сравниваем значения времени забега каждого участника
        System.out.println("Firs place: " + sortedResults.get(0));//возвращает первый элемент отсортированного списка
        // результатов забега
        System.out.println("Last place: " + sortedResults.get(sortedResults.size()-1));//возвращает имя участника,
        // занявшего последнее место в отсортированном списке результатов забега





    }
}