package Chapter02Loop;

public class TestFactorial {
    public static void main(String[] args) {
        TestFactorial a = new TestFactorial();
        long c = a.factorial(10);
        System.out.println(c);
        long b = a.factorialLoop(10);
        System.out.println(b);
    }
    static long factorial(int a){
        if (a==1){
            return 1;
        }else {
            return a*factorial(a-1);
        }
        //递归的本质就是自己调用自己，其实很消耗资源，尽量不要去使用
    }

    static long factorialLoop(int a){
        int sum=1;
        while (a>1){
            sum*=a*(a-1);
            a-=2;
        }
        //这个方法并不是递归而是循环，循环效率比递归要高上很多
        return sum;
    }
}
