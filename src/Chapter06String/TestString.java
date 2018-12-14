package Chapter06String;

public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "19"+18;//并不是加法，而是字符串连接
        System.out.println("#########################################");
        String str10 = "Nosfy";
        String str11 = "Nosfy";
        String str12 = new String("Nosfy");

        System.out.println(str10==str11);
        System.out.println(str12==str11);//11和12不是同一个对象

        //通常情况下，比较字符串都使用equals

        System.out.println(str11.equals(str12));
    }
}
