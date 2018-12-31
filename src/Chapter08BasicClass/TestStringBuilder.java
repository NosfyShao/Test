package Chapter08BasicClass;

public class TestStringBuilder {
    public static void main(String[] args) {

        //StringBuilder现成不安全，效率高（一般使用这个）；StringBuffer线程安全，效率低
        StringBuilder sb = new StringBuilder("asdkfjaklsdfj");

        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

        sb.setCharAt(2,'M');
        System.out.println(sb);
    }
}
