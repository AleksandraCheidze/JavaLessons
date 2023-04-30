import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Alphabet");
        //Задача 1. Заполнить список символами латинского алфавита
        // в цикле for код символа "A" - 65, код символа "B" - 66, и т.д. до код "Z" = 90.

        ArrayList<String>alphabetList = new ArrayList<String>();

        for (int i = 0; i < 26; i++) {
            alphabetList.add(i, String.valueOf((char) (65 + i)));


        }
        System.out.println(alphabetList);
    }
}