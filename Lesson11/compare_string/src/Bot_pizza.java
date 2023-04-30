import java.util.Scanner;

public class Bot_pizza {
    public static void main(String[] args) {
        System.out.println("Dobrij denj! Zakazite u nas pizzu");
        //Необходимо выяснить у клиента:
        //- имя,
        //- адрес - город, улица, дом,
        //- размер L или S
        //- по результату выбора сообщить цену и далее запросить способ оплаты
        //- закончить корректно диалог
        Scanner scanner = new Scanner(System.in);
        //uznaem imja
        System.out.println("Kak vas zovut");
        String name = scanner.next();
        int l = name.length();
        System.out.println("Zdrastvuite, " + name.toUpperCase().charAt(0) + name.substring(1, l) + "!");
        String nameCorrect = name.toUpperCase().charAt(0) + name.substring(1, l);
        //uznaem adres
        System.out.println("IZ kakogo vi goroda?");
        String city = scanner.next();
        // nado proveritj korrektnostj vvedennogo goroda
        if (city.equalsIgnoreCase("Berlin") || city.equalsIgnoreCase("Берлин")) {
            System.out.println("Mi gotovi prinjatj vash zakaz.Govorite dalshe po russki");
        } else {
            System.out.println("Vash gorod ne osluzhivaetsa. Nam ochenj zhalj, " + nameCorrect);
            return; // etot operator zavershaet programmu
        }


        System.out.println("Na kakoi ulice vi zhivete?");
        String house = scanner.next();
        // razmer L ili S
        System.out.println("Vin=berite razmer picci: S - malenkaja pizza, L - bolshaja pizza");
        String pizzaSize = scanner.next();
        if (pizzaSize.equalsIgnoreCase("s")) {
            int pizzaPrice = 45;
            System.out.println("Vasha pizza stoit " + pizzaPrice);
        } else if (pizzaSize.equalsIgnoreCase("l")) {
            int pizzaPrice = 55;
            System.out.println("Vasha pizza stoit " + pizzaPrice);
        } else {
            System.out.println("Izvinite mi vas ne ponjali");
            return; }
            //zaprositj sposob oplati - na saite kartoi ili nalichnimi pri poluchenii
            System.out.println("Spasibo za zakaz ");

        }

    }








