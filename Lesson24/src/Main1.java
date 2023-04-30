import java.util.HashMap;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Group list with Ages");
        // Задача 1: Создать HashMap с именами и возрастом членов нашей группы.
        // Распечатать списоок группы с возрастами.

        HashMap<String, Integer> group26Map = new HashMap<>();

        group26Map.put("Galina", 44);
        group26Map.put("Oleksandr Zhurba", 38);
        group26Map.put("Aleksandra", 16);
        group26Map.put("Marina", 41);
        group26Map.put("Luka", 28);
        group26Map.put("Tetiana", 34);
        group26Map.put("Christian", 30);
        group26Map.put("Yulia", 52);
        group26Map.put("Andrei", 36);
        group26Map.put("Egor", 29);
        group26Map.put("Dmitrijs", 32);
        group26Map.put("Wladimir", 31);
        group26Map.put("Galina", 34); //eto znachenie zamenilo staroe, tak kak kluch sovpal

        //System.out.println(group26Map); eto bistraja pechatj HashMap

        // Print keys - проход по всем ключам
        // for (String i : nameHashMap.keySet())
        // System.out.println(i);

        // cikl for each, prohod po vsem znachenijam
        for (String name : group26Map.keySet()) {
            System.out.println(name); // v operatore dolzhna uchastvovatj peremennaja cikla

        }
        // Print values - проход по всем значениям for (String i : nameHashMap.values()) {
        // System.out.println(i); }
        for (int age : group26Map.values()) {
            System.out.println(age + " , "); // v operatore dolzhna uchastvovatj peremennaja cikla

        }
        // Print keys and values - проход по всем ключам и их значениям
        // for (String i : nameHashMap.keySet()) {
        // System.out.println("key: " + i + " value: " + nameHashMap.get(i)); }
        for (String st : group26Map.keySet()){
            System.out.println("Key: " + st + " value: " + group26Map.get(st));
        }
    }
}