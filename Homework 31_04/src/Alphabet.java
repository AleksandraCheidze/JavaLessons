import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
//   1. Используя Switch и оператор if else написать программу, проверяющую  является ли принятый
// со сканера символ согласной  буквой английского алфавита, гласной буквой английского алфавита
// либо не является буквой английского алфавита.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the letter");
        char letter= sc.next().charAt(0);
        letter = Character.toUpperCase(letter);

        if (letter>='A' && letter<='Z') {
            switch (letter) {
                case 'A':
                case 'I':
                case 'C':
                case 'D':
                case 'U':
                    System.out.println("Letter is vowel");
                    break;
                default:
                    System.out.println("Letter is consonant");
            }
        }    else{
            System.out.println("It is not an English letter");
        }





        }

    }

