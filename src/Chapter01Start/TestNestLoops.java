package Chapter01Start;

public class TestNestLoops {
    //基础行列嵌套
    /*public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }*/
    //九九乘法表
  /*  public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" * "+i+" = "+i*j+"\t");
            }
            System.out.println();
        }
    }*/
  //奇偶求和
 /*   public static void main(String[] args) {
        int sumOdd=0;
        int sumEven=0;
        for (int i=1;i<=100;i++){
            if (i%2==0){
                sumEven+=i;
            }
            if (i%2==1){
                sumOdd+=i;
            }
        }
        System.out.println("偶数和为："+sumEven);
        System.out.println("奇数和为："+sumOdd);
    }*/
    public static void main(String[] args) {
        for (int i=1;i<=1000;i++){
          if (i%5==0){
              System.out.print(i+"\t");
          }
          if (i%25==0){
              System.out.println();
          }
        }
    }
}
