package Chapter07Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        for (int i=0;i<=9;i++){
            arr01[i]=i*2+1;
            System.out.println(arr01[i]);
        }
    }
}
