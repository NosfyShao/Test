package Chapter08BasicClass;

public class TestString {
    public static void main(String[] args) {
//        String str = "aaabbb";
//        String str2= str.substring(2,5);
//
//        System.out.println(str);
//        System.out.println(str2);

        String str1="hello"+" java";
        String str2="hello java";
        System.out.println(str1==str2);
        String str3 = "hello";
        String str4 = " java";
        String str5 =str3+str4;
        System.out.println(str2==str5);
        System.out.println(str2.equals(str5)); //做字符串比较一般使用equals不要使用==

    }
}
