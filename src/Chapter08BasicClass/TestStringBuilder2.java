package Chapter08BasicClass;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();

        for (int i=0;i<26;i++){
            char temp = (char)('a'+i);
            sb.append(temp);
        }
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3,'N');
        sb.insert(0,'我');
        System.out.println(sb);

        sb.delete(20,23);
    }
}
