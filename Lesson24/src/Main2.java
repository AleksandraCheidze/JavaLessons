import java.util.HashMap;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        //Задача 2: Создать HashMap с именами и полом членов нашей группы.
        // Подсчитать количество мужчин и женщин.
        System.out.println("Group list with Sex");

        HashMap<String, String> group26MapSex = new HashMap<>();
        group26MapSex.put("Oleksandr Zhurba", "M");
        group26MapSex.put("Aleksandra", "W");
        group26MapSex.put("Marina", "W");
        group26MapSex.put("Luka", "M");
        group26MapSex.put("Tetiana", "W");
        group26MapSex.put("Christian", "M");
        group26MapSex.put("Yulia", "W");
        group26MapSex.put("Andrei", "M");
        group26MapSex.put("Egor", "M");
        group26MapSex.put("Dmitrijs", "M");
        group26MapSex.put("Wladimir", "M");

        int man = 0;
        //ciklom for each podschitatj kolichestvo muzhchin
        for (String name : group26MapSex.keySet()) {
            if (group26MapSex.get(name).equals("M")) {
                man++;
            }

        }
        int woman = 0;
        //ciklom for each podschitatj kolichestvo zhenschin
        for (String name : group26MapSex.keySet()) {
            if (group26MapSex.get(name).equals("W")) {
                woman++;

            }
        }
        System.out.println("Men in group: " + man);
        System.out.println("Women in group: " + woman);
    }
}