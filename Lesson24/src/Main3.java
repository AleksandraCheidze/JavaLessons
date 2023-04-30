import java.util.HashMap;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Frequency words in Sentence");

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.\";";
        System.out.println("Дано предложение: " + sentence);

//        На входе имеется текст, необходимо получить ответ на вопрос,
//        какие слова встречаются в нем чаще других?
        // Алгоритм действий:
        // Нам нужно плучить ответ в виде пары:
        // Слово(word - String) + " встретилось  в тексте" + количество(frequencies - Integer)
        // 1 - metodom split zanosim slova v massiv
        // 2 - zapuskaem cikl for, on budet pereberatj vse slova odno za drugim
        // v nem vnutri vtoroi cikl, kotorij sravnit slova so vsemi drugimi slovami v predlozhenii
        // kogda budut sovpadenija frequancy++ NO eto frequancy nado podschitatj dlja kazhdogo slova
        // to estj u nas pojavitsa massiv znachenij frequancy [i}
        // v HashMap mi zanesem v word[i] i frequancy[i]

        String [] s = sentence.toLowerCase().split(" "); // s = eto massiv dlja slov
        int w = s.length; //eto dlinna massiva, to estj kolichestvo slov v predlozhenii
        System.out.println("Kolichestvo slov v predlozhenii" + w);

        int [] frequancy = new int[w]; //eto massiv dlja chastoti slova

        for (int i = 0; i < s.length; i++) { //etot cikl vibiraet  slovo
            for (int j = 0; j < s.length; j++) {//eto perebor vseh drugih slov
                if (s[i].equals(s[j])){
                    frequancy [j]++;

                }

            }


        }
        HashMap<String, Integer> wordFrequancy = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            wordFrequancy.put(s[i], frequancy[i]);


        }
        for (String word : wordFrequancy.keySet()) {
            System.out.println("Word " + word + "Frequency " + wordFrequancy.get(word));
        }
        }

    }
