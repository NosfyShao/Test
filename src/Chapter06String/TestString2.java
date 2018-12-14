package Chapter06String;

public class TestString2 {
    public static void main(String[] args) {
        String s1 = "core Java";
        String s2 = "Core Java";
        System.out.println(s1.charAt(3));
        System.out.println(s2.length());

        System.out.println(s1.indexOf("Java"));
        System.out.println(s1.indexOf("Apple"));

        String s = s1.replace(' ','&');
        System.out.println(s);
    }
}
