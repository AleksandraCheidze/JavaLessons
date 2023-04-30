// Java program to understand
// why to avoid == operator

public class Test {
    public static void main(String[] args)
    {
        String s1 = new String("HELLO");
        String st1 = "Udacha";

        String s2 = new String("HELLO");
        String st2 = "Udacha";

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
    }
}