package Chapter02Loop;
//定义递归头，什么时候不调用自身方法；
//定义递归题，什么时候调用自身方法；

public class TestRecursion01 {
    public static void main(String[] args) {
        a();
    }
    static int count=0;
    static void a(){
        System.out.println("a");
        count++;
        if (count<10){
            a();
        }else {
            return;
        }
    }
    static void b(){
        System.out.println("b");
        a();
    }
}
