import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    //Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 (37 s zero) ячеек, куда может
    // попасть шарик, и два цвета - красный, черный. Результат попытки
    // вывести так: "Выиграл номер NN, четное или нечетное, цвет".
    public static void main(String[] args) {

        //Что будем вводить? Что на входе? vvod s klaviatri "nachaj krutitj"
        //Какие данные на входе? "rezultat kruchenija ruletki", 20 raz ona prokrutilasj i 20 rezultatov pokazalo
        //Chto dolzhno proizoiti? pojavitsa rezultat kruchenija ruletki
        //Kluchevoi algoritm? - rabotaem s datchikom sluchainih chisel
        //Kakoi interfeis s polzavatelem? rabotu ruletki pokazhem v vide gotovogo rezultata
        //Kak krasnoe i chernoe sootnositsa s nomerami? krasnoe i chernoe prosto zagadivaem (0 ili 1)
        //Chet, necghet opredeljaetsa po chislu/nomeru - delimostj na 2 s ostatkom

        //int n = (int)(Math.random() * (b - a + 1) + a) - генерирует случайное целое
        // число в интервале [a, b] a - может быть, b - может быть

        int[] result = new int[20];//sjuda polozhim rezultati kolesa
        int[] color = new int[20];
        String [] iven = new String[20];
        String [] color1 = new String[20];



        for (int i = 0; i < result.length; i++) {
            result [i] = (int)(Math.random() * (36 - 0 + 1) + 0); //mi krutnuli ruletku
            color[i] = (int)(Math.random() * (1 - 0 + 1) + 0); //eto mi zadumivaem cvet
            if (result[i] %2 == 0){
                iven[i] = "chetnoe";
            }else {
                iven[i] = "nechjotnoe";
            }
            if (color[i]==0) {
                color1[i]= "red";

            } else  {
                color1[i] = "black";
            }
            System.out.println("Vijgral nomer:" + result[i] + ", " + iven[i] + ", cvet " + color1[i]);

        }
    }
}
