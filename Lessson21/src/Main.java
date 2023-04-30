import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        System.out.println("ArrayList practicum");
        //ArrayList<ТИП> имяМассива = new ArrayList<ТИП>(); tak objavljaetsa ArrayList
        ArrayList<String> aotoBrandList = new ArrayList<String>();

        aotoBrandList.add("BMW");
        aotoBrandList.add("Audi");
        aotoBrandList.add("Skoda");
        aotoBrandList.add("Lexus");
        aotoBrandList.add("Jaguar");
        aotoBrandList.add("Dodge");
        aotoBrandList.add("Opel");
        aotoBrandList.add("Volvo");
        aotoBrandList.add("ZAZ");
        aotoBrandList.add("KIA");
        aotoBrandList.add("Ferrari");

        System.out.println(aotoBrandList); //napechatali spisok
        //uznaem dlinu spiska (kolichestvo elementov)
        int lenght = aotoBrandList.size();
        System.out.println("Numbers of brends in list " + lenght);

        // uznaem nomer (indeks) v spiske
        int index = aotoBrandList.indexOf("Lexus");
        System.out.println("Index Lexus in the list: " + index);

        //uznaem nalichie v spiske
        boolean brandPresents = aotoBrandList.contains("KIA");
        System.out.println("KIA presents:" + brandPresents);
        //dobavljaem
        aotoBrandList.add("Audi");
        System.out.println(aotoBrandList);
        //dobavljaem eschjo raz AUDI
        aotoBrandList.add("AUDI");
        System.out.println(aotoBrandList); //mozhno dobavljatj odinakovie elementi v spisok

        //udalenie elementa iz spiska
        aotoBrandList.remove("AUDI");
        System.out.println(aotoBrandList);
        int ind1 = aotoBrandList.indexOf("Audi"); // ischem index
        aotoBrandList.remove(ind1);//udaljaem po indeksu
        System.out.println(aotoBrandList); //pechataem spisok

        String brand = aotoBrandList.get(5);//poluchenie elementa po indeksu
        System.out.println(brand);
        //poluchaem indeksi vseh elementov
        for (int i = 0; i < aotoBrandList.size(); i++) {
            System.out.println(i + " : " + aotoBrandList.get(i));

        }

        //sortirovka spiska (lista)
        Collections.sort(aotoBrandList);
        System.out.println(aotoBrandList);//pechataem spisok



    }
}