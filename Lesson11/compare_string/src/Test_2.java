// Java program to show how to compare Strings
// using library function
public class Test_2
{ public static void main(String[] args)
{
    String s1 = "Cohort26";
    String s2 = "Cohort26";
    String s3 = "School AIT";
    String s4 = "ABCEFG";

    System.out.println(" Comparing strings with compareTo:");// announce togo, chto delaet etot kod
    System.out.println(s1.compareTo(s2)); // cohort26 comparing with cohort26, expect for true
    System.out.println(s1.compareTo(s3)); // cohort26 comparing with School AIT, expect for false
    System.out.println(s1.compareTo(s4)); // Cohort26 comparing with ABCEFG, expect for false
}
}