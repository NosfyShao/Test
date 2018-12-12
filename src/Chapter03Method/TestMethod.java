package Chapter03Method;

public class TestMethod {
    public static void main(String[] args) {
        //通过对象来调用普通方法
        TestMethod tm = new TestMethod();
        tm.printSxt();
        int c = tm.add(30,40,50)+666;
        System.out.println(c);
    }
    void printSxt(){
        System.out.println("疯狂敲代码");
    }
    int add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
        return sum;  //return作用：1.解暑方法的运行； 2.返回值
    }
}
