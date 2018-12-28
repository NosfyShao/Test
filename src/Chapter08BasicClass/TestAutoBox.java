package Chapter08BasicClass;

public class TestAutoBox {
    public static void main(String[] args) {
        Integer a = 234; // Integer a = Integer.valueOf(234)

        int b = a; //int b = a.intValue();

        Integer c = null;
        int d = c; //空指针会报错，因为拆箱调用了c.intValue()

        //缓存（-128，127之间的数字）
        Integer in1 = -128;
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为123在缓存范围内
        System.out.println(in1.equals(in2));//true

        System.out.println("#######################");

        Integer in3=1234;
        Integer in4=1234;
        System.out.println(in3==in4);
        System.out.println(in3.equals(in4));
        System.out.println("##########################")
        ;
    }
}
