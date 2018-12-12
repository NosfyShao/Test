package Chapter03Method;

public class TestOverload {
    //重载的方法是完全独立不同的方法，只是名称相同而已
    //形参类型，形参个数，形参顺序不同的时候，就会构成方法的重载
    public static void main(String[] args) {
        TestOverload a = new TestOverload();
        a.add(1,2);
        a.add(1,2,3);
    }

    public int add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    public  int add(int a,int b,int c){
        int sum= a+b+c;
        System.out.println(sum);
        return sum;
    }
}
