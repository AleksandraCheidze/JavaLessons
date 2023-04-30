import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        //Задача 1. Создать собственный ArrayList, выполнить с ним все операции, которые мы делали на занятии:
        //
        //создать список
        //наполнить элементами
        //распечатать
        //узнать размер (длину)
        //узнать индекс какого-либо элемента
        //удалить какой-либо элемент
        //проверка на наличие
        //добавление дубликата
        //печать списка с индексами
        //сортировка
        ArrayList<String>bundesländer = new ArrayList<String>();

        bundesländer.add("Baden-Württemburg");
        bundesländer.add("Bayern");
        bundesländer.add("Berlin");
        bundesländer.add("Brandenburg");
        bundesländer.add("Bremen");
        bundesländer.add("Hamburg");
        bundesländer.add("Hessen");
        bundesländer.add("Mecklenburg-Vorpommern");
        bundesländer.add("Niedersachsen");
        bundesländer.add("Nordrhein-Westfalen");
        bundesländer.add("Rheinland-Pfalz");
        bundesländer.add("Das Saarland");
        bundesländer.add("Sachsen");
        bundesländer.add("Sachsen-Anhalt");
        bundesländer.add("Schleswig-Holstein");
        bundesländer.add("Thüringen");

        System.out.println(bundesländer);

        int length = bundesländer.size();
        System.out.println("Anzahl der Bundesländer " + length);

        int index = bundesländer.indexOf("Berlin");
        System.out.println("Index Berlin ist " + index);

        bundesländer.remove("Hamburg");
        System.out.println(bundesländer);

        boolean verfügbarkeit = bundesländer.contains("Hessen");
        System.out.println(verfügbarkeit);

        bundesländer.add("Hessen");
        System.out.println(bundesländer);

        for (int i = 0; i < bundesländer.size(); i++) {
            System.out.println(i + " " + bundesländer.get(i));
        }

            Collections.sort(bundesländer);
            System.out.println(bundesländer);

       // Доп. вопрос - как отредактировать элемент списка?

        bundesländer.set(1, "Bayern1");
        System.out.println(bundesländer);






    }
}