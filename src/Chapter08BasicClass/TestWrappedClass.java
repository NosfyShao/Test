package Chapter08BasicClass;

public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转换成包装类对项
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(30);

        //把包装类对项转换成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        //把字符串转成包装类对项
        Integer e =new Integer("9999");
        Integer f =Integer.parseInt("99999");

        //把包装类对项转成字符串
        String str = f.toString();

        //常见的常量
        System.out.println("int类的最大整数"+Integer.MAX_VALUE);
    }
}
